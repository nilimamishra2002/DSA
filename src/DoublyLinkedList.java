public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
public void addLast(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
    }
    else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next=null;
    }
    size++;
}
public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;

        if(size==1){
            head=tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
    size-- ;
    return val;
}
public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;

        if(size==1){
            head=tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
        size-- ;
        return val;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();
    }
}
