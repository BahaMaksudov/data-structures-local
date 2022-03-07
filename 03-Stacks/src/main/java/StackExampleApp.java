public class StackExampleApp {

    public static void main(String[] args) {

        var myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("Size of the stack is : "+myStack.size());

        myStack.push(2);
        myStack.push(3);
        System.out.println("Size of the stack is : "+myStack.size());

        System.out.println("---------------Character Stack-----------");
        MyStack<Character> myStack1 = new MyStack<>();
        myStack1.push('c');
        myStack1.push('b');
        myStack1.push('a');
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println("Size of the stack is : "+myStack1.size());

    }
}
