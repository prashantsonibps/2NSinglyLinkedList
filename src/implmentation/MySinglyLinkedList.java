package implmentation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    //head or Start of linked list, this will refer to first element
    // of linked list
    private Node head;
    //tail or end  of linked list, this will refer to last element
    // of linked list
    private Node tail;
    //total number of elements in linked list
    private int size;
    //constructor
    public MySinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    //metrhod to check if linkded list is empty
    @Override
    public boolean isEmpty(){
        return head == null;
    }
    //to get the number of element in linked list
    @Override
    public int size(){
        return size;
    }
    //adding element at head
    @Override
    public void addFirst(int element){
        //create a node
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.setNext(head);
            head = node;
            size++;
        }
    }

}
