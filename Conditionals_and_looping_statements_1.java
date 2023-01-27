import java.util.*;
public class Conditionals_and_looping_statements_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int compChoice = rnd.nextInt(20);
        System.out.print("Computer choice : "+ compChoice);

        for(int i = 1; i <= 6; i++){
            System.out.println("Guess a number between 0 and 20");
            int userChoice = sc.nextInt();
            if(userChoice>compChoice){
                System.out.println("Your guess is too high");
            }
            else if(userChoice<compChoice){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("You guessed it right");
                break;
            }
        }
    }
}
