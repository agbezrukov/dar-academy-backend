package hw.hw10.task13;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("q", "qaz");
        stringMap.put("w", "wsx");
        stringMap.put("e", "edc");
        stringMap.put("r", "rfv");
        stringMap.put("t", "tgb");
        stringMap.put("y", "yhn");

        containsValue(stringMap, "tgb");
        containsValue(stringMap, "tg2");

        Map<String, String> resultCopyMap = copyMap(stringMap);
        System.out.println(resultCopyMap);
        stringMap.put("r", "222");
        System.out.println(stringMap);
        System.out.println(resultCopyMap);
        System.out.println(stringMap);

    }

    //Напишите программу для копирования всех записей из одной HashMap в другую.
    private static Map<String, String> copyMap(Map<String, String> stringMap) {
        return new HashMap<>(stringMap);
    }

    //Напишите программу для проверки, содержит ли HashMap запись для указанного значения.
    private static void containsValue(Map<String, String> stringMap, String value) {
        if (stringMap.containsValue(value)) {
            System.out.println("Содержит запись");
        } else {
            System.out.println("Не содержит запись");
        }
    }
}
