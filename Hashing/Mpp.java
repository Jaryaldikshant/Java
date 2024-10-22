
// Made our own HashMap, no need to do it, just use the below ones 
class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }

    }

    private class Entity {

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Mpp {

    public static void main(String[] args) {

        MapUsingHash mpp = new MapUsingHash();
        mpp.put("Mango","King of fruits");
        mpp.put("Apple","A sweet red fruit");
        mpp.put("Litchi","Better for Imunity");
        System.out.println(mpp.get("Apple"));




        // // HashMap
        // HashMap<String, Integer> mpp = new HashMap<>();
        // mpp.put("Dikshant", 94);
        // mpp.put("Rahul", 95);
        // mpp.put("Gorav", 90);
        // System.out.println(mpp.get("Rahul"));
        // System.out.println(mpp.getOrDefault("Abhi", 0));
        // for (var it : mpp.entrySet()) {
        //     System.out.println(it.getKey() + "-> " + it.getValue());
        // }
        // System.out.println(mpp.containsKey("Abhi"));
// // HashSet: used to remove duplicates values
        // HashSet<Integer> set = new HashSet<>();
        // set.add(12);
        // set.add(11);
        // set.add(20);
        // set.add(11);
        // set.add(75);
        // set.add(34);
        // System.out.println(set);
// // TreeMap : for returning anything in sorted order
        // TreeMap<String,Integer> map = new TreeMap<>();
        // map.put("Ajay",20);
        // map.put("Rahu", 15);
        // map.put("Abhi",18);
        // map.put("Ram",24);
        // System.out.println(map);
    }
}
