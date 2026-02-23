public class GuessValidator {
    public static String validateGuess(int guess, int target) {
        if (guess == target) return "CORRECT";
        return (guess > target) ? "HIGH" : "LOW";
    }
}