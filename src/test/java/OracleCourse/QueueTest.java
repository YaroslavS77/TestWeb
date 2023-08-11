package OracleCourse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {
        PersonQueue personQueue1 = new PersonQueue(1);
        PersonQueue personQueue2 = new PersonQueue(2);
        PersonQueue personQueue3 = new PersonQueue(3);
        PersonQueue personQueue4 = new PersonQueue(4);

        Queue<PersonQueue> people = new ArrayBlockingQueue<>(3);
        System.out.println(people.offer(personQueue3));
        System.out.println(people.offer(personQueue1));
        System.out.println(people.offer(personQueue4));
        System.out.println(people.offer(personQueue2));

    }
}

class PersonQueue {
    private int id;

    public PersonQueue(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonQueue{" +
                "id=" + id +
                '}';
    }
}
