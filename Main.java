import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Prompt the user to guess a number between 1 and 100
        String userInput = JOptionPane.showInputDialog("Pick a number between 1 and 100:");
        int userNumber = Integer.parseInt(userInput);

        // Check if the user's guess is within the valid range
        if (userNumber < 1 || userNumber > 100) {
            JOptionPane.showMessageDialog(null, "Please pick a number between 1 and 100.");
            return;
        }

        //Two numbers
        int number1 = (int) (Math.random() * userNumber);
        int number2 = userNumber - number1;

        // Calculate the sum of the two numbers
        int sum = number1 + number2;

        // Display the numbers and prompt the user to guess the sum
        String firstInput = JOptionPane.showInputDialog(
                "Guess the first number of the sum:\n" + sum);
        String secondInput = JOptionPane.showInputDialog(
                "Guess the second number of the sum:\n" + sum);
        try {
            // Convert the user's input to an integer
            int userGuess1 = Integer.parseInt(firstInput);
            int userGuess2 = Integer.parseInt(secondInput);
            // Check if the guess is correct
            if (userGuess1 == number1 && userGuess2 == number2) {
                JOptionPane.showMessageDialog(null, "Congratulations! Your guesses are correct.");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, the correct numbers were " + number1 + "," + number2 +".");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
    }
}
