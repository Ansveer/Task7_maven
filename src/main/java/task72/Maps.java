package task72;
import java.util.*;
import java.util.stream.Collectors;

//import java.util.HashMap;
//import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Long, String> testMap = new LinkedHashMap<>();

        testMap.put(89217255054L, "Сидоров Агафон Никанорович");
        testMap.put(89535720971L, "Петров Петр Петрович");
        testMap.put(89113315675L, "Иванов Иван Иванович");

        List<Map.Entry<Long, String>> testMap3 = new ArrayList<>(testMap.entrySet());

        Collections.shuffle(testMap3);

        for (Map.Entry<Long, String> entry: testMap3){
            System.out.println(entry);
        }
        System.out.println();

        ArrayList<Long> testMap2 = new ArrayList<>(testMap.keySet());

        Collections.sort(testMap2);

        for (Long x: testMap2){
            System.out.println(x + "=" + testMap.get(x));
        }
        System.out.println();

        for (Map.Entry<Long, String> entry: testMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println();
    }
}
