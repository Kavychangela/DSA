// class Node {
//     int data;
//     Node next;
    
//     Node(int data1, Node next1){
//         this.data=data1;
//         this.next=next1;
//     }

//     Node(int data1){
//         this.data=data1;
//         this.next=null;
//     }

// };

// public class LinkedList{
//     public static void main(String[] args) {
//         int []arr={2,5,6,8};
//         Node y=new Node(arr[3]);
//         System.out.println(y.data);
//         System.out.println(y.data);
//     }
// }

import java.util.*;

class Node{
    public int data;
    public Node next;

    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
}

public class LinkedList{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(8);
        arr.add(7);

        Node y1=new Node(arr.get(0), null);
        Node y2=new Node(arr.get(1), null);
        Node y3=new Node(arr.get(2), null);
        Node y4=new Node(arr.get(3), null);

        y1.next=y2;
        y2.next=y3;
        y3.next=y4;

        System.out.println(y1.data+" "+ y1.next);
        System.out.println(y2.data+" "+ y2.next);
        System.out.println(y3.data+" "+ y3.next);
        System.out.println(y4.data+" "+ y4.next);
    }
}