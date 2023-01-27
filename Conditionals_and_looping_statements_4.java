import java.util.*;
public class Conditionals_and_looping_statements_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your burp ?");
        int brplen = sc.nextInt();
        String msg = "";
        for (int i = 0; i < brplen; i++){
            msg = msg + "r";
        }
        System.out.println("Bu"+msg+"p");

    }
}
