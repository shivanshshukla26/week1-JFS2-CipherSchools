import java.util.*;
public class Conditionals_and_looping_statements_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        switch (div) {
            case 1 -> System.out.println("First rank");
            case 2 -> System.out.println("Second rank");
            case 3 -> System.out.println("Third rank");
            default -> System.out.println("No Rank");
        }
    }
}
