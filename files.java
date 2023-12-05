import java.util.*;
import java.io.*;

public class files{
    public static void main (String args[]){
    File f1 = new File("letter.txt");
    Scanner sc = new Scanner(System.in);
    try{
        FileOutputStream fos = new FileOutputStream(f1);
        System.out.println("enter string");
        String sentence = sc.nextLine();
        int length = sentence.length();
        for(int i =0; i<length;i++){
            char letter = sentence.charAt(i);
            fos.write(letter);
        }
        fos.close();
        FileInputStream fis = new FileInputStream(f1);
        int input = fis.read();
        int vowels =0,consonants=0,space =0;
        while(input !=-1){
            char letter = (char)input;
            if(letter == 'a'|| letter  == 'e'||letter == 'i'||letter == 'o'||letter == 'u'){
                vowels++;
            }
            else if(letter == ' '){
                space++;
            }
            else{
                consonants++;
            }
            input = fis.read();
        }
        System.out.println(vowels + " " + space + " " + consonants);
    }
    catch(Exception e){
            System.out.println(e);
    }
}
}
