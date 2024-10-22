
public class UniqueEle {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};

// using HashMap:
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (mp.containsKey(arr[i])) {
        //         mp.put(arr[i], mp.get(arr[i]) + 1);
        //     } else {
        //         mp.put(arr[i], 1);
        //     }
        // }
        // for (Integer k : mp.keySet()) {
        //     if (mp.get(k) < 2) {
        //         System.out.println(k);
        //     }
        // }


        // using XOR:
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);

    }
}
