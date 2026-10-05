import java.util.Scanner;

public class FuelCosts {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double fuelVolume;
    double engineEfficiency;
    double fuelPrice;
    boolean done = false;
    do {
      if (in.hasNextDouble()) {
        fuelVolume = in.nextDouble();
        in.nextLine();

      }
    } while (!done);
  }
}
