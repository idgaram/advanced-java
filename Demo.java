import java.util.HashMap;

// public static <K, V> K getKeyByValue(Map<K, V> map, V targetValue){
//     for (Map.Entry<K, V> entry : map.entrySet()) {
//         if(entry.getValue() == targetValue){
//             return entry.getKey();
//         }
//     }
//     return null;
// }

public class Demo{ 

    public static void main (String[] args) throws InterruptedException{

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("eric", 18);
        myMap.put("angelina", 88);
        myMap.put("andre", 17);

        // Integer targetValue = 88;
        // String key = getKeyByValue(myMap, targetValue);

        // System.out.println(myMap.get("angelina"));


        for (String name : myMap.keySet()){
            System.out.println(name + " has an age of : " + myMap.get(name));
        }

           };
    }