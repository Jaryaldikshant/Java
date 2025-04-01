// Implimentation of HashMap

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

    static class HashMap<K, V> { // generics

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // nodes
        private int N; // size
        private LinkedList<Node>[] bucket; // N = bucket.length

        public HashMap() {

            this.N = 4;
            this.bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K Key) { // always lies b/w 0  to N-1
            int bucketIndex = Key.hashCode();
            return Math.abs(bucketIndex) % N;
        }

        private int searchInLL(K key, int bucketIndex) {

            LinkedList<Node> ll = bucket[bucketIndex];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i; // dataindex
                }
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node>[] oldBucket = bucket;

            N = N * 2;

            bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }

            n = 0;

            for (LinkedList<Node> ll : oldBucket) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key); // index in the array

            int dataIndex = searchInLL(key, bucketIndex); // index in the linked list

            if (dataIndex == -1) { // key doesn't exsist
                bucket[bucketIndex].add(new Node(key, value));
                n++;
            } else { // key exists
                Node node = bucket[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double) n / N;
            double k = 2.0;

            if (lambda > k) { // rehashing
                reHash();
            }

        }

        public boolean containsKey(K key) {

            int bucketIndex = hashFunction(key); // index in the array

            int dataIndex = searchInLL(key, bucketIndex); // index in the linked list

            if (dataIndex == -1) { // key doesn't exsist
                return false;
            } else { // key exists
                return true;
            }

        }

        public V get(K key) {
            int bucketIndex = hashFunction(key); // index in the array

            int dataIndex = searchInLL(key, bucketIndex); // index in the linked list

            if (dataIndex == -1) { // key doesn't exsist 
                return null;
            } else {
                Node node = bucket[bucketIndex].get(dataIndex);
                return node.value;
            }
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key); // index in the array

            int dataIndex = searchInLL(key, bucketIndex); // index in the linked list

            if (dataIndex == -1) {
                return null;
            } else {
                Node node = bucket[bucketIndex].remove(dataIndex);
                return node.value;

            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : bucket) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> mpp = new HashMap<>();

        mpp.put("India", 190);
        mpp.put("China", 180);
        mpp.put("Us", 50);

        System.out.println("India's Population: " + mpp.get("India"));
        System.out.println("Contains China? " + mpp.containsKey("China"));
        mpp.remove("China");
        System.out.println("Contains China after removal? " + mpp.containsKey("China"));
        System.out.println("Keys: " + mpp.keySet());
    }
}
