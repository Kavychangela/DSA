class Node{
    int data;
    Node next;

    Node(int val){
        data=val;
        next=null;
    }
}

public class ArrtoLL{
    public static Node arrayToLinkedList(int[] arr) {
        int size=arr.length;
        if(size==0) return null;

        Node head=new Node(arr[0]);
        Node current=head;

        for(int i=1; i<size; i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return head;
    }

    public static void printLinkedList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Print the linked list
        printLinkedList(head);
    }
}