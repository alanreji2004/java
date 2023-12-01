import java.util.*;

interface queue1{
    void enqueue();
    void dequeue();
    void display();
}

class queue2 implements queue1{
    Scanner sc = new Scanner(System.in);
    int front = -1,rear = -1,n;
    int a[] = new int[10];
    int value,i;
    
    public void enqueue(){
        if(rear == n-1){
            System.out.println("--overflow--");
            return;
        }
        else if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
        }
        else{
            rear = rear + 1;
        }
        System.out.println("enter the element to be inserted");
        value = sc.nextInt();
        a[rear] = value;
    }
    
    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("--underflow");
            return;
        }
        else if(front == rear){
            value = a[front];
            front = -1;
            rear = -1;
        }
        else{
            value = a[front];
            front = front+1;
        }
        System.out.println("the dequed element is : " + value);
    }
    public void display(){
        if(front == -1 && rear == -1){
            System.out.println("--underflow");
            return;
        }
        else{
            for (i=front;i<=rear ;i++ ){
                System.out.print("\t" + a[i] +"\t|");
            } 
            System.out.println(" ");
        }
    }
}

public class Main{
    public static void main(String args[]){
        int c;
        Scanner sc = new Scanner(System.in);
        queue2 q = new queue2();
        System.out.println("Enter the size of the queue");
        q.n = sc.nextInt();
        while(true){
            System.out.println("Enter choice\n1.enqueue\n2.dequeue\n3.display\n4.exit");
            c = sc.nextInt();
            switch(c){
                case 1: q.enqueue();
                    break;
                case 2 : q.dequeue();
                    break;
                case 3 : q.display();
                    break;
                case 4 : System.exit(0);
            }
        }
    }
}
