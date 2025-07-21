public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
        }
    }

    public static class Node{
        Node next;
        int value;

        public Node(int value){
            this.value = value;
        }

    }
}
