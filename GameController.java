import java.util.*;
public class GameController {
    public static boolean restartGame(Scanner scanner) {
        System.out.println("Do You want to play again? (yes/no):");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
    
}
