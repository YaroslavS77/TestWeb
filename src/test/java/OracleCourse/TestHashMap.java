package OracleCourse;

import org.bouncycastle.pqc.crypto.gmss.Treehash;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>(); //Всередині не гарантується порядок
       Map<Integer, String> linked = new LinkedHashMap<>(); //В якому порядку пари (ключ, значення) були добавлені, в такому порядку вони і повернуться
       Map<Integer, String> tree = new TreeMap<>(); // пари (ключ, значення) сортуються по ключу та в природньому порядку

       testMap(tree);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(44, "Bob");
        map.put(73, "Mike");
        map.put(83, "Yaroslav");
        map.put(93, "John");
        map.put(0, "Alex");
        map.put(7743, "Lewis");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
