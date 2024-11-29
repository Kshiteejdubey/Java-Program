class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Linklist {
    private Node head;

    public void inserAtEnd(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
             temp=temp.next;
        }
        temp.next= newNode;
    }
    public void reverse(){
        Node curr = head;
        Node nextPtr = null;
        Node prev = null;

        while (curr!=null) {
              nextPtr = curr.next;
              curr.next = prev;
              prev =curr;
              curr =nextPtr;
        }
        head = prev;
        return;
    }
    public void PrintLL(){
        Node temp = head;
        while (temp!=null) {
             System.out.println(temp.data);
             temp= temp.next;
        } 
    }
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.inserAtEnd(12);
        list.inserAtEnd(46);
        list.inserAtEnd(32);
        list.inserAtEnd(29);
        list.PrintLL();
        System.out.println("after reversal");
        list.reverse();
        list.PrintLL();
    }
}