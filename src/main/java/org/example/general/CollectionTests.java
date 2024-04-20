package org.example.general;
import java.util.*;
public class CollectionTests {

    public static void main(String [] args){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(1,1);
        System.out.println(myList.get(1));

        //LinkedList
        List<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

//        Iterator<Integer> iterator = myLinkedList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        myLinkedList.add(2,2);
        Iterator<Integer> iterator = myLinkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Stack in collection
        Stack<String> stack = new Stack<>();
        stack.push("test");
        stack.push("first");
        System.out.println(stack.peek());
        stack.pop();
        stack.empty();

        //Queues:::
        Queue<String> myQueue = new PriorityQueue<>() ;
        Queue<String> q2 = new ArrayDeque<>();

        Set<String> mySet = new HashSet<>();
        mySet.add("Ravi");
        mySet.add("Vijay");
        mySet.add("Ram");
        mySet.add("Vijay");

        Iterator<String> iterator1 = mySet.iterator();
        while(iterator1.hasNext())
            System.out.println(iterator1.next());

    }
}
