package org.example.datastructure;

public class LinkedListUse {

    public static void main(String[] args){

    Node<Integer> head = createLinkedList();
    printLinkedList(head);


    }

    private static void printLinkedList(Node<Integer> head) {
        do{
            System.out.println(head.data);
            head = head.next;
        }while(head!=null);
    }

    public static Node<Integer> createLinkedList(){
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;

        return node1;
    }
}
