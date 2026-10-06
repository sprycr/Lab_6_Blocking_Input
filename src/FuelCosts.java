import java.util.Scanner;

public class FuelCosts {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double fuelVolume = 0;
    double engineEfficiency = 0;
    double fuelPrice = 0;
    double mileCost = 0;
    double totalCost = 0;
    double range = 0;
    boolean done = false;
    String trash;
    System.out.println("Please enter the amount of fuel in your tank (in gallons):");
    do { // fuelVolume
      if (in.hasNextDouble()) {
        fuelVolume = in.nextDouble();
        in.nextLine();
        done = true;
      } else {
        trash = in.nextLine();
        System.out.println("Please input a number. You entered: " + trash);
      }
    } while (!done);
    done = false;
    System.out.println("Please enter the fuel efficiency (in miles/gallon):");
    do { // engineEfficiency
      if (in.hasNextDouble()) {
        engineEfficiency = in.nextDouble();
        in.nextLine();
        done = true;
      } else {
        trash = in.nextLine();
        System.out.println("Please input a number. You entered: " + trash);
      }
    } while (!done);
    done = false;
    System.out.println("Please enter the cost of gas (in USD/gallon):");
    do { // fuelPrice
      if (in.hasNextDouble()) {
        fuelPrice = in.nextDouble();
        in.nextLine();
        done = true;
      } else {
        trash = in.nextLine();
        System.out.println("Please input a number. You entered: " + trash);
      }
    } while (!done);
    // logic
    // range:
    range = fuelVolume * engineEfficiency;
    // totalCost:
    mileCost = fuelPrice / engineEfficiency;// USD/mile
    totalCost = mileCost * 100;
    System.out.println("your current range is: " + range + " miles.");
    System.out.println("It would cost $" + totalCost + " to drive 100 miles.");
  }
}
