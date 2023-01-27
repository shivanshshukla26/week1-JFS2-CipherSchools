import java.util.*;
public class Java_setup_and_practice_exercise_2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter basic pay: ");
            double bp = sc.nextInt();
            double hra = 0, da = 0;
            if(bp >=5000){
                hra = 0.1*bp;
                da = 0.2*bp;
            }
            else{
                hra = 0.2*bp;
                da = 0.3*bp;
            }
            System.out.println(hra+" "+da);
            System.out.println(bp+hra+da);
        }
    }
}
