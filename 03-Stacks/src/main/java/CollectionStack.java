import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {

    public static void main(String[] args) {

        Stack<Integer> sStack = new Stack<>();
        // instead of Stack we can use Deque interface
//        Deque<Integer> stack = new ArrayDeque<Integer>();

        //we can use LinkedList implementation as well, below the code
        Deque<Integer> stack = new LinkedList<>();
//        Stack<Integer> stack = new Stack<>();



        for (int i=0; i<5; i++) {
            stack.push(i);
        }

        System.out.println("Stack elements are: ");
        stack.forEach(System.out::println);
        System.out.println("Top of the stack " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("Updated Stack after popping 2 elements from the top of the stack: ");
        stack.forEach(System.out::println);


    }
}
