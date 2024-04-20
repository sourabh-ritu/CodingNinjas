package org.example.datastructure;

public class LinkedListCodility {

    public static void main(String[] args){
        Node<Integer> head = createLinkedList();
        int count=0;

        while(head.data!=-1){
            head = head.next;
            count++;
        }
        System.out.println(count);
    }

    public static Node<Integer> createLinkedList(){
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(-1);
        head.next = n1;
        n1.next=n3;
        n3.next=n4;
        return head;
    }
}
