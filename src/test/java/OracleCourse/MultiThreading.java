package OracleCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker{
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addToList1() throws InterruptedException {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
    }

    public void addToList2() throws InterruptedException {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
    }

    public void work() throws InterruptedException {
        for (int i = 0; i < 10000; i++){
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
            work();
        long after = System.currentTimeMillis();
        System.out.println("Program done " + (before - after));
        System.out.println(list1.size());
        System.out.println(list2.size());
    }

}