import java.util.*;

class even implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=100;i=i+2){
            System.out.print(i);
        }
        System.out.println(" ");
    }
}

class odd implements Runnable{
    public void run(){
        int j;
        for(j=1;j<=100;j=j+2){
            System.out.print(j);
        }
        System.out.println(" ");
    }
}

class Main{
    public static void main(String args[]){
        even e = new even();
        odd o = new odd();
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}
