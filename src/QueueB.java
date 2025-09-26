//public class QueueB {
//    static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        Queue(int n){
//            arr=new int[n];
//            size=n;
//            rear=-1;
//        }
//circular queue using array
//static class Queue{
//    static int arr[];
//    static int size;
//    static int rear;
//    static int front;
//    Queue(int n){
//        arr=new int[n];
//        size=n;
//        rear=-1;
//        front=-1;
//    }
//Queue using LinkedList
//static class Node{
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//    }
//    static class Queue {
//    static Node head=null;
//    static Node tail=null;

//        public static boolean isEmpty(){
////            return rear==-1;
//            //circular queue
//            return rear==-1 && front==-1;
            //Queue using LinkedList
//            return head==null && tail==null;
//        }
    //circular queue
//        public static boolean isFull(){
//        return (rear+1)%size == front;
//        }
//        public static void add(int data){
//            if(rear==size-1){
//                System.out.println("Queue is full");
//                return;
//            }
//            rear=rear+1;
//            arr[rear]=data;

            //circular queue
//            if(isFull()){
//                System.out.println("Queue is full");
//                return;
//            }
//            //add 1st element
//            if(front==-1){
//                front=0;
//            }
//            rear=(rear+1)%size;
//            arr[rear]=data;

            //Queue using LinkedList
//            Node newNode=new Node(data);
//            if(head==null){
//                head=tail=newNode;
//                return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//        }
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            int front=arr[0];
//            for(int i=0;i<rear;i++){
//                arr[i]=arr[i+1];
//            }
//            rear=rear-1;
//            return front;

            //circular queue
//            int result=arr[front];
//            //last el delete
//            if(rear==front){
//                rear=front=-1;
//            }else{
//                front=(front+1)%size;
//            }
//            return result;

            //Queue using LinkedList
//            int front=head.data;
//            //single element
//            if(tail==head){
//                tail=head=null;
//            }else{
//                head=head.next;
//            }
//            return front;
//        }
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            return arr[0];
//            return arr[front];
//            return head.data;
//        }
//    }

//    public static void main(String[] args) {
////        Queue q=new Queue(3);
//        Queue q=new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//        System.out.println(q.remove());
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}

//Queue using jcf(java collection framework)

//
//public class QueueB {
//    public static void main(String[] args) {
//        Queue<Integer> q= new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}


//
////Queue using two stacks
//public class QueueB {
//    static class Queue{
//        static Stack<Integer> s1=new Stack<>();
//        static Stack<Integer> s2=new Stack<>();
//        public static boolean isEmpty(){
//            return s1.isEmpty();
//        }
//        public static void add(int data){
//            while(!s1.isEmpty()){
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//            while(!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//        }
//        public static int remove(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return s1.pop();
//        }
//        public static int peek(){
//            if(isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return s1.peek();
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q=new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}


//Stack using two queues
//public class QueueB {
//   static class Stack{
//       static Queue<Integer> q1=new LinkedList<>();
//       static Queue<Integer> q2=new LinkedList<>();
//       public static boolean isEmpty(){
//           return q1.isEmpty() && q2.isEmpty();
//       }
//       public static void push(int data){
//           if(!q1.isEmpty()){
//               q1.add(data);
//           }
//           else{
//               q2.add(data);
//           }
//       }
//       public static int pop(){
//           if(isEmpty()){
//               System.out.println("stack is empty");
//               return -1;
//           }
//           int top=-1;
//           //case1
//           if(!q1.isEmpty()) {
//               while (!q1.isEmpty()) {
//                   top = q1.remove();
//                   if (q1.isEmpty()) {
//                       break;
//                   }
//                   q2.add(top);
//               }
//           }
//               else{//case2
//                   while(!q2.isEmpty()){
//                       top=q2.remove();
//                       if(q2.isEmpty()){
//                           break;
//                       }
//                       q1.add(top);
//                   }
//               }
//           return top;
//           }
//
//       public static int peek(){
//           if(isEmpty()){
//               System.out.println("Stack is empty");
//               return -1;
//           }
//           int top=-1;
//           //case1
//           if(!q1.isEmpty()){
//               while(!q1.isEmpty()){
//                   top=q1.remove();
//                   q2.add(top);
//               }
//           }else{//case2
//               while(!q2.isEmpty()){
//                   top=q2.remove();
//                   q1.add(top);
//               }
//           }
//           return top;
//       }
//
//       public static void main(String[] args) {
//           Stack s=new Stack();
//           s.push(1);
//           s.push(2);
//           s.push(3);
//           while(!s.isEmpty()){
//               System.out.println(s.peek());
//               s.pop();
//           }
//       }
//   }
//   }

//public class QueueB{
//    public static void printNonrepeating(String str){
//        int freq[]=new int[26];
//        Queue<Character> q= new LinkedList<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            q.add(ch);
//            freq[ch-'a']++;
//            while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                q.remove();
//            }
//            if(q.isEmpty()){
//                System.out.print(-1+" ");
//            }else {
////                System.out.print(q.peek()+" ");
//                System.out.print(str.indexOf(q.peek())+" ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        String str="aabccxb";
//        printNonrepeating(str);
//    }
//}


//import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueB{
//    public static void interLeave(Queue<Integer> q){
//        Queue<Integer> firstHalf=new LinkedList<>();
//        int size=q.size();
//        for(int i=0;i<size/2;i++){
//            firstHalf.add(q.remove());
//        }
//        while(!firstHalf.isEmpty()){
//            q.add(firstHalf.remove());
//            q.add(q.remove());
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//        interLeave(q);
//        //print q
//        while(!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println();
//    }
//}


//Queue reversal
//public class QueueB{
//    public static void reverse(Queue<Integer> q){
//        Stack<Integer> s=new Stack<>();
//        while(!q.isEmpty()){
//            s.push(q.remove());
//        }
//        while(!s.isEmpty()){
//            q.add(s.pop());
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        reverse(q);
//        while(!q.isEmpty()){
//            System.out.print(q.remove()+" ");
//        }
//        System.out.println();
//    }
//}

//import java.util.Deque;
//import java.util.LinkedList;
//
////Double Ended Queue
//public class QueueB{
//    public static void main(String[] args) {
//        Deque<Integer> deque=new LinkedList<>();
//        deque.addFirst(1);
//        deque.addFirst(2);
//        deque.addLast(3);
//        deque.addLast(4);
//        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getLast());
//    }
//}

//import java.util.Deque;
//import java.util.LinkedList;
//
////Stack Using Deque
//public class QueueB{
//    static class Stack{
//        Deque<Integer> deque=new LinkedList<>();
//        public void push(int data){
//            deque.addLast(data);
//        }
//        public  int pop(){
//            return deque.removeLast();
//        }
//        public int peek(){
//            return deque.getLast();
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack s=new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//    }
//}

import java.util.Deque;
import java.util.LinkedList;

//Queue Using Deque
public class QueueB{
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
          return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
