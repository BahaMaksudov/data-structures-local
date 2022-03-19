import java.util.HashMap;

public class QueueTestApp {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        System.out.println(myQueue.peek());
        System.out.println("Removed item from Queue is " +myQueue.dequeue());
        System.out.println("Removed item from Queue is " +myQueue.dequeue());


        HashMap<Integer, String> a = new HashMap<>();
        a.put(1,"Baha");
        System.out.println(a.containsValue("Baha"));  //if we use contains (key value) then complexity is O(1)
    }
}
