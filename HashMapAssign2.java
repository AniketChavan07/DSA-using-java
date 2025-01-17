import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        // Create a new HashMap to store the merged result
        Map<String, Integer> mergedMap = new HashMap<>();

        // Add all entries from mapOne to mergedMap
        for (Entry<String, Integer> entry : mapOne.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        // Add all entries from mapTwo to mergedMap
        for (Entry<String, Integer> entry : mapTwo.entrySet()) {
            mergedMap.put(entry.getKey(), entry.getValue());
        }

        return mergedMap;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<>();
        mapOne.put("Kelly", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);

        Map<String, Integer> mapTwo = new HashMap<>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }
}
