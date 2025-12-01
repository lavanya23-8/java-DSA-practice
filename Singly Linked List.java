class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

class LinkedList {
    Node head;

    void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class TestLL {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);

        ll.display();
    }
}
