import java.util.*;
class GameConfig {
    private final int MIN=1;
    private final int MAX=100;
    private final int Max_attempts=7;
    private final int MAx_hints=3;


    int targetNumber;
    public GameConfig(){
        Random random = new Random();
        this.targetNumber=  random.nextInt(MAX-MIN+1)+MIN;

    }

    public int getTargetNumber()
    { 
        return targetNumber;
    }
    public int getMaxAttempts()
    { 
        return Max_attempts;
    }
    public int getMaxHints()
    { 
        return MAx_hints;
    }
    public void showRules(){
        System.out.println("Guess a number between"+MIN +"and"+MAX);
        System.out.println("You Have"+Max_attempts+"attempts");
        System.out.println("Hints will be provided after wrong gueses");
        
    }

    
}
public class Guessing {
   

   public static void main(String[] var0) {
      System.out.println("Wellcome to Guessing App");
      GameConfig var1 = new GameConfig();
      var1.showRules();
   }
}




