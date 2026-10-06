import java.util.Random;
import java.util.Scanner;

public class HighorLow {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner in = new Scanner(System.in);
    int guess;
    int value;
    boolean done = false;
    int lBound = 1;
    int uBound = 11;
    int tries = 0;

    value = rand.nextInt(lBound, uBound);
    System.out.println("Guess a number between " + lBound + " and " + (uBound - 1));
    do {
      if (in.hasNextInt()) {
        tries += 1;
        guess = in.nextInt();
        in.nextLine();
        if (guess < uBound && guess > lBound) {

          if (guess == value) {
            System.out.println("You guessed correctly in " + tries + " tries! the number was: " + value);
          } else if (guess > value) {
            System.out.println("Your guess was too high.");
          } else {
            System.out.println("Your guess was too low.");
          }
          done = true;
        } else {
          System.out
              .println("Please guess a number between " + lBound + " and " + (uBound - 1) + " You guessed: " + guess);
        }
      } else {
        String trash;
        trash = in.nextLine();
        System.out.println("Please guess an integer. You guessed: " + trash);
      }
    } while (!done);
  }
}
