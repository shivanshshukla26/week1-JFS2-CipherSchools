import java.util.*;
public class Conditionals_and_looping_statements_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter speed : ");
        int speed = sc.nextInt();
        
        System.out.println("Today is your birthday : ");
        boolean birthday = sc.nextBoolean();
        
        if(birthday){
            speed -= 5;
        }
        if(speed>80)System.out.println("High ticket");
        else if(speed>=60)System.out.println("Mid ticket");
        else System.out.println("No ticket");
    }
}
