import java.util.*;

class Main extends Exception{
    public static void main(String args[]){
        int a,b,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            r = a/b;
            System.out.println(r);
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
        finally{
            System.out.println("output is generated");
        }
    }
}
