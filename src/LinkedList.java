public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head; //link
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node (data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return 1;
            }
            temp=temp.next;
            i++;
        }
        return -1;
}
public int recSearch(int key){
        return helper(head,key);
}
public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next,key);
        if(index==-1){
            return -1;
        }
        return index+1;
}
public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
}
public int deleteNthFromEnd(int n){
        //calc size
    int size=0;
    Node temp=head;
    while(temp != null){
        temp=temp.next;
        size++;
    }
    if(n==size){
        head=head.next;
        return 0;
    }
    int i=1;
    int iToFind=size-n;
    Node prev=head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return 0;
}
public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
}
public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
}
public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
            return false;
}
public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            cycle = true;
            break;
        }
    }
    if (cycle==false) {
        return;
    }
    //find meeting point
    slow = head;
    Node prev = null;
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
}
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
public Node merge(Node head1,Node head2){
        Node mergedLL= new Node(-1);
        Node temp=mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
    while(head2 != null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
    }
    return mergedLL.next;
}
public Node mergeSort(Node head){
        if(head==null ||head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);
}
public void zigzag(){
    Node slow=head;
    Node fast=head.next;
    while(fast != null && fast.next !=null ){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr != null){
        next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left = head;
    Node right=prev;
    Node nextL;
    Node nextR;
    while(left != null && right != null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;
        left=nextL;
        right=nextR;
    }
}
    public void print(){
        if(head==null) {
            System.out.println("LL is empty.");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedList l1= new LinkedList();
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addLast(5);
        l1.addLast(1);
        l1.addLast(6);
//        l1.addMiddle(2,6);
        l1.print();
//        l1.removeFirst();
//        l1.print();
//        l1.removeLast();
//        l1.print();
//        System.out.println(l1.size);
//        System.out.println(l1.itrSearch(3));
//        System.out.println(l1.itrSearch(8));
//        System.out.println(l1.recSearch(3));
//        System.out.println(l1.recSearch(8));
//        l1.reverse();
//        System.out.println(l1.deleteNthFromEnd(3));
//        System.out.println(l1.checkPalindrome());
        //l1.print();
//        l1.head= new Node(1);
//        l1.head.next= new Node(2);
//        l1.head.next.next=new Node(3);
//        l1.head.next.next.next=new Node(1);
//        head=new Node(1);
//        Node temp=new Node(2);
//        head.next=temp;
//        head.next.next=new Node(3);
//        head.next.next.next=temp;
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());
        l1.head=l1.mergeSort(l1.head);
        l1.print();
        l1.zigzag();
        l1.print();
    }
}
