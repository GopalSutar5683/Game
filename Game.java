import java.util.Random;
import java.util.Scanner;
public class Game{
    public static void main(String[] args){
        Scanner gs = new Scanner(System.in);
        Random rn= new Random();
        int randomno = rn.nextInt(100) + 1;
        System.out.println("Welcome to the Guessing The Number Game !!");
        System.out.println("I am thinking of a number between 1 and 100. \n Can you guess is??");
        int attempt= 0;
        boolean guessed= false;
        while(!guessed){
            System.out.println("Enter Your Guess: ");
            int guess = gs.nextInt();
            attempt++;
            if(guess == randomno){
                System.out.println("Hurrey !! Your Guess is Correct in "+ attempt + "attemps.");
                guessed= true;

            }else if(guess < randomno){
                System.out.println("Too low!! Try again.");

            }else{
                System.out.println("Too High!! Try again.");
            }
            }
            gs.close();
        }

    }
