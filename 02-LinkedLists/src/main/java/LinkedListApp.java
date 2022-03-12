public class LinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList list1=new MySinglyLinkedList();
        for(int i =0;i<11;i++) list1.add(i);
        list1.printNodes();
        System.out.println("Kth item from last is: "+list1.getKthFromLast(4));

        list1.removeKthFromLast(3);

//        System.out.println(list1.indexOf(4));
//        System.out.println("Size before deletion is : "+list1.size);
        list1.printNodes();
//        list1.deleteNode(5);
//        System.out.println("Deleting value = " + 5);
//        System.out.println("Size after deletion is : "+list1.size);
//        list1.printNodes();


        //Assignment 3 remove Duplicates from LinkedList
        System.out.println("----------Remove Duplicates from LinkedList -------------------");
        MySinglyLinkedList list2=new MySinglyLinkedList();
        int[] numbers={1,1,2,2,2,3,4,4,4,4,5,6,6};
        for(int i=0;i<numbers.length-1;i++) list2.add(numbers[i]);
        System.out.println("With duplicates");
        list2.printNodes();
        System.out.println("Without duplicates");
        list2.removeDuplicatesFromLinkedList();
        list2.printNodes();


        //Assignment 4 reverse LinkedList
        System.out.println("----------Reverse LinkedList -------------------");
        MySinglyLinkedList list3=new MySinglyLinkedList();
        for(int i=0;i<10;i++) list3.add(i);
        list3.printNodes();
        System.out.println("After reverse in one pass");
        list3.reverse();
        list3.printNodes();

    }
}
