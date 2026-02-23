import java.util.*;
public class ValidationService {

    
    public static int validateInput(String input)
            throws InvalidInputException {

        if (input == null) {
            throw new InvalidInputException("Input is required.");
        }

        String trimmed = input.trim();
        if (trimmed.isEmpty()) {
            throw new InvalidInputException("Input cannot be empty.");
        }

        try {
            int value = Integer.parseInt(trimmed);

            if (value < 1 || value > 100) {
                throw new InvalidInputException(
                        "Number must be between 1 and 100");
            }

            return value;

        } catch (NumberFormatException e) {
            throw new InvalidInputException(
                    "Invalid input. Please enter numbers only.");
        }
    }
}