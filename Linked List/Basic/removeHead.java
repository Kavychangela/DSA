class Node{
    int data;
    Node next;

    Node(int val){
        data=val;
        next=null;
    }
}

public class removeHead{
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

    public static int lengthOfLinkedList(Node head){
        int length=0;
        Node current=head;

        while(current!=null){
            length++;
            current=current.next;
        }
        return length;
    }

    public static boolean searchElement(Node head, int target){
        Node current=head;
        while(current!=null){
            if(current.data==target){
                System.out.println("Present");
                return true;
            }
            current=current.next;
        }
        System.out.println("Not Present");
        return false;
    }

    private static Node removesHead(Node head){
        if (head==null) return head;
        head=head.next;
        return head;
    }

    private static Node removesTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node removekthNode(Node head, int k){
        if(head==null)return head;
        if(k==1){
            head=head.next;
            return head;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to linked list
        Node head = arrayToLinkedList(arr);

        // Print the linked list
        printLinkedList(head);
        // print length
        int length=lengthOfLinkedList(head);
        System.out.println("Length of the linked list:" + length);
        //Search element
        searchElement(head, 5);
        //remove head
        head=removesHead(head);
        System.out.println(head+"LL after deleting head");
        printLinkedList(head);
        //remove tails
        head=removesTail(head);
        System.out.println(head+"LL after deleting Tail");
        printLinkedList(head);
    }
}