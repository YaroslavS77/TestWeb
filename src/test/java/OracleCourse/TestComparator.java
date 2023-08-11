package OracleCourse;

import java.util.*;

//public class TestComparator {
//    public static void main(String[] args) {
//        List<String> newAnimalsList = new ArrayList<>();
//
//        newAnimalsList.add("Tiger");
//        newAnimalsList.add("Cat");
//        newAnimalsList.add("Dog");
//        newAnimalsList.add("Antilope");
//        newAnimalsList.add("Bird");
//
//        Collections.sort(newAnimalsList, (o1, o2) -> {
//            if (o1.length() > o2.length()) {
//                return 1;
//            } else if (o1.length() < o2.length()) {
//                return -1;
//            }return 0;
//        });
//
//        System.out.println(newAnimalsList);
//
//        List<Integer> newNumbersList = new ArrayList<>();
//
//        newNumbersList.add(2);
//        newNumbersList.add(5);
//        newNumbersList.add(9);
//        newNumbersList.add(6);
//        newNumbersList.add(0);
//
//        Collections.sort(newNumbersList, (o1, o2) -> {
//            if (o1 > o2){
//                return -1;
//            } else  if (o1 < o2){
//                return 1;
//            }return 0;
//        });
//
//        System.out.println(newNumbersList);
//    }
//}

class Test{
    public static void main(String[] args) {
        List<NameCard> newList = new ArrayList<>();
        newList.add(new NameCard(3, "Tom"));
        newList.add(new NameCard(2, "Jack"));
        newList.add(new NameCard(1, "Bob"));

        Collections.sort(newList, new Comparator<NameCard>() {
            @Override
            public int compare(NameCard o1, NameCard o2) {
                 if(o1.getId() > o2.getId()){
                     return -1;
                 }else if (o1.getId() < o2.getId()){
                     return 1;
                 }return 0;
            }
        });

        System.out.println(newList);
    }
}

class NameCard {
    private int  id;
    private String name;
    public NameCard(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NameCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
