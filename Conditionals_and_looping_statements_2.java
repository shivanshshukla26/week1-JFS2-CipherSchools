import java.util.*;
public class Conditionals_and_looping_statements_2 {
    public static void main(String[] args){
        char ch = 'A';
        while(ch<=90){
            System.out.println(ch+" ");
            ch++;
        }
        char ch2 = 'A';
        do{
            System.out.println(ch2+" ");
            ch2++;
        }
        while(ch2 <= 'Z');
    }
}
