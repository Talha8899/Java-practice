import java.util.*;
public class miniprojec {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Talha's Mini Project!");
        System.out.println("its a number gussing game.");
        System.out.println("you have to guess a number between 1 and 100.");
        // generate the random number
        int randomNumber = (int)(Math.random() * 100);
        //System.out.println("Random Number: " + randomNumber);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100:");
        int usernum;
        do {
            //System.out.println("Enter your guess again (or enter 000 to exit):");
            usernum=sc.nextInt();
        if(usernum==randomNumber){
            System.out.println("Congratulations! You guessed the right number.");
        }else if(usernum<=randomNumber){
            System.out.println("your  guess number is small (or enter 000 to exit game)");
        }else if(usernum>=randomNumber){
            System.out.println("your  guess number is large (or enter 000 to exit game)");
        }else if (usernum==000){
            System.out.println("Exiting the game. Goodbye!");
        } else {
            System.out.println("Sorry, invalid try again.(or enter 000 to exit)");
        }
        }while (usernum!=randomNumber && usernum!=000);
    }
}
// The program will continue to prompt the user until they guess the correct number
// or enter 000 to exit the game.
// The random number is generated between 0 and 99, so the user should enter a number between 1 and 100.
// The program will print a congratulatory message if the user guesses the correct number,
// or an error message if the guess is incorrect.
// The program uses a do-while loop to ensure that the user is prompted at least once.
// The Scanner class is used to read user input from the console.
// The program is a simple number guessing game.
// It demonstrates basic control flow, user input handling, and random number generation in Java.
// The code can be further enhanced by adding features like counting the number of attempts,
// providing hints to the user, or implementing a scoring system.
