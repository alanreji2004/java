import java.util.*;

class InvalidNumberException extends Exception{
    public InvalidNumberException(String s){
        System.out.println(s);
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        try{
            if(a<0){
                throw new InvalidNumberException("invalid");
            }
            else{
                System.out.println(a);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
