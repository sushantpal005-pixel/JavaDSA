package Linked_List.lec_78;

public class SinglyLinkedList {

    static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //Insertion at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        //if LL is empty -> head and tail ko newNode pr point krdo
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase the size by 1
        size++;
    }

    //Insertion at tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Insertion at Position
    public void insertAtPosition(int position, int data){
        if(position < 1 || position > size + 1){
            //insertion not possible
            System.out.println("Insertion is not possible at this position");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size + 1){
            insertAtTail(data);
            return;
        }
        //middle me insert krna h
        Node prevNode = head;
        //move prevNode by (position - 2) step, to reach to the previous node of the destination location
        for(int i = 0; i <= position - 2; i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        //update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    static void main() {

    }
}
