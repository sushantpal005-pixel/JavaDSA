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

    //Insertion at head O(1)
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

    //Insertion at tail O(1)
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

    //Insertion at Position O(n)
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

    //Traversal O(n)
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    //utility functions O(1)
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    } // O(1)

    public int getHead(){
        if(head == null) return -1;
        else return head.data;
    }  // O(1)

    public int getTail(){
        if(tail == null) return -1;
        else return tail.data;
    }  // O(1)

    //Searching

    //Returns true if value exists  O(n)
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target) return true;
            else{
                temp = temp.next;
            }
        }
        //agr mai yha pauch gya
        //iska mtlb h ll puri tarvel ho chuki h
        //and khi par bhi target nhi mila
        return false;
    }

    //Returns 1-based positions   O(n)
    public int findPositions(int target){
        Node temp = head;
        int position = 1;

        while(temp != null){
            if(temp.data == target) return position;
            else{
                temp = temp.next;
                position++;
            }
        }
        //agr yha paucha, iska mtlb
        //entire ll me target nhi mila
        return -1;
    }

    //Update using position  O(n)
    public void updateAtPositions(int position, int newData){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid position given in input");
            return;
        }
        Node temp = head;
        //take temp to the position given in input
        for(int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        //ab mera temp, exact postion wali node pr h
        temp.data = newData;
    }

    //Update first occurrence of value  O(n)
    public boolean updateValue(int oldValue, int newValue){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldValue){
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    //Deletion

    //Delete first node  O(n)
    public void deleteHead(){
        if(head == null) {
            System.out.println("LL is already empty, can't delete element");
        }
        //main logic
        head = head.next;
        size--;
        //be cautious -> check whether after deletion LL has become empty or not
        if(head == null){
            tail = null;
        }
    }

    //Delete tail node O(n)
    public void deleteTail(){
         if(head == null){
             System.out.println("LL is already empty, can't delete element");
             return;
         }
         //check for single node
        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }
        //logic for normal > 1 length wali LL
        Node temp = head;
        for(int i = 1; i <= size - 2; i++){
            temp = temp.next;
        }
        //now temp is pointing at second last node of ll
        temp.next = null;
        tail = temp;
        //update size
        size--;
    }

    //Delete at position O(n)
    public void deleteAtPosition(int position){
        if(position < 1 || position > size + 1){
            System.out.println("LL is already empty, can't delete element");
            return;
        }
        if(position == 1){
            deleteHead();
            return;
        }
        if(position == size){
            deleteTail();
            return;
        }

        //variable setup
        Node prev = head;
        //prev ko position - 2 step move krunga to mai nodeToDelete ke piche wali node pe pauch jaunga
        for(int i = 1; i < position - 1; i++){
            prev = prev.next;
        }
        Node curr = prev.next;
        Node forward = curr.next;

        //main logic
        prev.next = forward;
        curr.next = null;
        size--;
        return;
    }

    //Delete first occurrence of value O(n)
    public boolean deleteValue(int target){
        if(head == null){
            System.out.println("LL is already empty, can't delete element");
            return false;
        }
        if(head.data == target){
            deleteHead();
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            if(curr.data == target){
                //deletion ka logic lgao
                Node forward = curr.next;

                prev.next = forward;
                curr.next = null;

                if(tail == curr){
                    //tail update
                    tail = prev;
                }
                size--;
                return true;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return false;
    }


    static void main() {
        SinglyLinkedList myList = new SinglyLinkedList();
        if(myList.isEmpty()){
            System.out.println("List is empty");
        }
        System.out.println("Size of LL: " + myList.getSize());
        myList.insertAtHead(10);
        myList.printList();

        myList.insertAtHead(20);
        myList.printList();

        myList.insertAtHead(30);
        myList.printList();

        myList.insertAtTail(100);
        myList.printList();

        myList.insertAtTail(110);
        myList.printList();

        myList.insertAtTail(120);
        myList.printList();

        myList.insertAtPosition(1, 22);
        myList.printList();

        myList.insertAtPosition(8, 200);
        myList.printList();

        myList.insertAtPosition(5, 500);
        myList.printList();

        System.out.println("head data: " + myList.getHead());
        System.out.println("tail data: " + myList.getTail());

        System.out.println("Found or Not: " + myList.search(2000));

        System.out.println("Position of 200 is: " + myList.findPositions(200));
        myList.updateAtPositions(95, 1);
        myList.printList();

        System.out.println("Update or not" + myList.updateValue(500, 5));
        myList.printList();

        myList.deleteHead();
        myList.printList();

        myList.deleteTail();
        myList.printList();

        myList.deleteAtPosition(3);
        myList.printList();

        myList.deleteAtPosition(1);
        myList.printList();

        myList.deleteValue(5);
        myList.printList();

    }
}
