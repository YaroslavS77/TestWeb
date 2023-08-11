//package OracleCourse;
//
//import java.util.*;
//
//public class ComparableTest {
//    public static void main(String[] args) {
//        List<PersonQueue> peopleList = new ArrayList<>();
//        Set<PersonQueue> peopleSet = new TreeSet<>();
//
//      addElements(peopleList);
//      addElements(peopleSet);
//
//        System.out.println(peopleList);
//        System.out.println(peopleSet);
//    }
//
//    private static void addElements(Collection collection) {
//        collection.add(new PersonQueue(1, "Bob"));
//        collection.add(new PersonQueue(2, "Jack"));
//        collection.add(new PersonQueue(3, "Steven"));
//        collection.add(new PersonQueue(4, "Jackson"));
//    }
//
//}
//
//class Person implements Comparable<PersonQueue>{
//    private int id;
//    private String name;
//
//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PersonQueue person)) return false;
//        return id == person.id && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(PersonQueue o) {
//        if (this.name.length() > o.getName().length()) {
//            return -1;
//        }else if (this.name.length() < o.getName().length()){
//            return 1;
//        }return 0;
//    }
//}
