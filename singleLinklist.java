
import java.util.Scanner;
public class singleLinklist {  

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int count;

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

          public void countNodes() {
        Node current = head;

              if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes count of singly linked list: ");
        while(current != null) {
            current = current.next;
            count++;
        }
        System.out.println(count);
        }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void deleteNode(int key)
    {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }
  int search(Node head, int x)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == x) {
                System.out.println(x+" is present");
//            break;
            return 0;}
                current = current.next;
        }
        System.out.println(x+" is not present");
        return 1;
    }

    public static void main(String[] args) {

        singleLinklist sList = new singleLinklist();

        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);
        sList.addNode(40);

        sList.display();
        sList.countNodes();
        sList.deleteNode(20);
        sList.search(sList.head, 10);
        sList.display();
    }
}