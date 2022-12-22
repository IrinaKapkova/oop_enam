package mapTest;

import java.util.*;

public class MapTest {
    private static final Map<String, Integer> map1 = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Проверка на наличие ключ-значение перед добавлением в карту");
        addToMap("str1", 15);
        addToMap("str", 15);
        addToMap("str2", 10);
        addToMap("str2", 5);
        addToMap("str3", 10);
        for (Map.Entry<String, Integer> StInEntry : map1.entrySet())
            System.out.println(StInEntry.getKey() + " -> " + StInEntry.getValue());
        System.out.println();
        System.out.println("Сложение чисел в списке и запись суммы в новое  значение коллекции");
        sum();
        System.out.println();
        System.out.println("Вывести в консоль содержимое коллекции в порядке добавления");
        orderOfAddition();

    }

    private static void orderOfAddition() {
        Map<Integer, String> map4 = new LinkedHashMap<>();
        map4.put(11, "одиннадцать");
        map4.put(2, "два");
        map4.put(35, "тридцать пять");
        map4.put(4, "четыре");
        map4.put(5, "пять");
        map4.put(16, "шестнадцать");
        map4.put(7, "семь");
        map4.put(8, "восемь");
        map4.put(90, "девяносто");
        map4.put(10, "десять");
        for (Map.Entry<Integer, String> InStEntry : map4.entrySet()) {
            System.out.println(InStEntry.getKey() + " -> " + InStEntry.getValue());
        }

    }

    private static void sum() {
        Map<String, List<Integer>> map2 = new HashMap<>();
        Random random = new Random();
        map2.put("str5", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map2.put("str6", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map2.put("str7", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map2.put("str8", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        map2.put("str9", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : map2.entrySet()) {
            map3.put(stringListEntry.getKey(), sumElements(stringListEntry.getValue()));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map3.entrySet()) {
            System.out.println((stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue()));
        }

    }
    private static Integer sumElements(List<Integer> List) {
        Integer sum = 0;
        for (Integer element : List) {
            sum += element;
        }
        return sum;
    }

    public static void addToMap(String s, Integer i) {
        if (map1.containsKey(s) && map1.containsValue(i)) {
            throw new RuntimeException(map1 + "запись не возможна! Такие ключ и значение уже есть!");
        }
        map1.put(s, i);
    }

}

