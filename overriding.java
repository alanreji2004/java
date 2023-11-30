import java.util.*;

class Person {
    void displayInfo() {
        System.out.println("He is a bright student");
    }
}

class Student extends Person {
    void displayInfo() {
        System.out.println("Student name is Arun");
        super.displayInfo();  
    }
}

public class main {
    public static void main(String args[]) {
        Student sc = new Student();
        sc.displayInfo();
    }
}
