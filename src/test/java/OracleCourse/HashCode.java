//package OracleCourse;
//
//import java.util.*;
//
//public class HashCode {
//    public static void main(String[] args) {
//        Map<NameCard, String> map = new HashMap<>();
//        Set<NameCard> set = new HashSet<>();
//
////        set.add("Hello");
////        set.add("Hello");
////
////        String string = "Hello";
////        string.equals("Hello");
//
//        NameCard nameCard1 = new NameCard(1, "One");
//        NameCard nameCard2 = new NameCard(1, "One");
//
//        map.put(nameCard1, "123");
//        map.put(nameCard2, "123");
//
//        set.add(nameCard1);
//        set.add(nameCard2);
//
//        System.out.println(map);
//        System.out.println(set);
//
//    }
//}
//
//class Person{
//    private int id;
//    private String name;
//    public Person(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id + ", name" + name +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof NameCard nameCard)) return false;
//        return id == nameCard.id && Objects.equals(name, nameCard.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}
