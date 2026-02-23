import java.util.Scanner;

public class GuessingApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Guessing App");
        System.out.println();

        GameConfig config = new GameConfig();
        config.showRules();

        Scanner sc = new Scanner(System.in);

        int attempts = 0;         
        int hintCount = 0; 

        while (attempts < config.getMaxAttempts()) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            String result = GuessValidator.validateGuess(guess, config.getTargetNumber());
            System.out.println(result);

            if ("CORRECT".equals(result)) {
                System.out.println("You got it in " + attempts + " attempt(s). 🎉");
                break;
            }
            if(hintCount<config.getMaxHints()){
                hintCount++;
                String hint=HintService.generateHint(config.getTargetNumber(),hintCount);
                System.out.println(hint);
            }
            
    }
}}