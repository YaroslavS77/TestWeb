//package OracleCourse;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class TestLesson {
//    public static void main(String[] args) throws InterruptedException {
//        new WorkerList().main();
//    }
//}
//
//class WorkerList{
//    Object lock1 = new Object();
//    Object lock2 = new Object();
//
//    Random random = new Random();
//    private List<Integer> list1 = new ArrayList<>();
//    private List<Integer> list2 = new ArrayList<>();
//
//    public void addToList1() throws InterruptedException {
//            synchronized (lock1) {
//                Thread.sleep(1);
//                list1.add(random.nextInt(100));
//            }
//    }
//
//    public void addToList2() throws InterruptedException {
//            synchronized (lock2) {
//                Thread.sleep(1);
//                list2.add(random.nextInt(100));
//            }
//    }
//
//    public void doIt() throws InterruptedException {
//        for (int i = 0; i < 1000; i++) {
//            addToList1();
//            addToList2();
//        }
//    }
//
//    public void main() throws InterruptedException {
//
//        long before = System.currentTimeMillis();
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    doIt();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    doIt();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//
//        long after = System.currentTimeMillis();
//
//        System.out.println("Current time is: " + (after - before));
//        System.out.println(list1.size());
//        System.out.println(list2.size());
//    }
//}
