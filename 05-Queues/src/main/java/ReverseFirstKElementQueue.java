import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
//        queue.add(1);
//        queue.add(2);
//        queue.remove();
//        System.out.println(queue.peek());

        for(int i=0; i<6; i++) {
            queue.add(i);
        }

        System.out.println(ReverseFirst(queue, 3));

    }
    public static Deque<Integer> ReverseFirst (Deque<Integer> queue, int k) {
// 0,1,2,3,4 - if you want to change order of 3 elements: stack[0,1,2] => queue [2,1,0,3,4]

        Stack<Integer> stack = new Stack<>();
        for (int i =0; i<k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop()); //1,2,3,4,5  is k=3 => 5-3 size of the queue - k
        }
        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
