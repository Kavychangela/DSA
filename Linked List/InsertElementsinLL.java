class Node{
    int data;
    Node next;

    Node(int val){
        data=val;
        next=null;
    }
}

public class InsertElementsinLL{
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

    public static Node insertHead(Node head, int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        return head;
    }

    public static Node insertEnd(Node head, int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
        return head;
    }

    public static Node insertkthNode(Node head, int val, int k){
        if(head==null){
            if(k==1){return new Node(val);}
        }
        if(k==1){
            Node temp=new Node(val, head);
        }
        Node temp=head;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);
        head=insertHead(head, 7);
        insertEnd(head, 8);
        // Print the linked list
        printLinkedList(head);
    }
}


