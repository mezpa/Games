/* Java game “Guess a Number” that allows user to guess a random number that has been generated.
*/
import javax.swing.*;
 
public class GuessGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 to 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ Guess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String Guess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is a miss, it is high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is a miss, it is low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
