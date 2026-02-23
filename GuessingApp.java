import java.util.Scanner;

public class GuessingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Guessing App");

        System.out.print("Enter Player Name: ");
        String player = sc.nextLine();

        GameConfig config = new GameConfig();
        config.showRules();

        int attempts = 0;
        boolean win = false;

        while (attempts < config.getMaxAttempts()) {

            System.out.print("Enter your guess: ");

            String input = sc.nextLine();
            int guess;

            try {
                guess = ValidationService.validateInput(input);
            } catch (InvalidInputException e) {
                
                System.out.println(e.getMessage());
                System.out.println();
                continue;
            }

            attempts++;

            String result = GuessValidator.validateGuess(
                    guess, config.getTargetNumber());

            String hint = HintService.generateHint(
                    config.getTargetNumber(), attempts);

            System.out.println(hint);
            System.out.println(result);

            if ("CORRECT".equalsIgnoreCase(result)) {
                win = true;
                break;
            }
        }

        StorageService.saveResult(player, attempts, win);

        sc.close();
    }
}
