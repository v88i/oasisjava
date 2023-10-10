/**
 * @author Vishwvijay Pradhan
 */
import java.util.Scanner;
import java.util.Random;  
public class guessGame_2{
    public static void main(String[] args) {
        int guess,numOfGuesses = 1;
        Random rand = new Random();
        int compInput = rand.nextInt(100);
        do{
            System.out.print("Enter the number between 1 to 100: ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if(guess>compInput){ System.out.println("Please guess lower number!");}
            else if(guess<compInput) { System.out.println("Please guess higher number!");}
            else{System.out.println("Yeah! You have guessed the number in "+numOfGuesses+" attempts");}
            numOfGuesses++;
        }while (guess!=compInput);
    }         
}