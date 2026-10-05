import java.util.Scanner;

public class CtoFConverter {
  public static void main(String[] args) {
    // F= (9/5 x C) + 32
    // C= ((F-32) x 5/9)
    Scanner in = new Scanner(System.in);
    boolean done = false;
    double inputTemp;
    double outputTemp;
    System.out.println("Please input a number in Celsius and it will be converted to Fahrenheit.");
    String trash;

    do {
      if (in.hasNextDouble()) {
        inputTemp = in.nextDouble();
        in.nextLine();
        if (inputTemp > (-273.15)) {
          outputTemp = ((1.8) * inputTemp) + 32; // 9/5 x C + 32
          System.out.println(inputTemp + "°C = " + outputTemp + "°F");
          done = true;
        } else {
          trash = in.nextLine();
          System.out.println("Please input a number greater than absolute zero (-273.15°C). You entered: " + trash);

        }
      } else {
        trash = in.nextLine();
        System.out.println("Please input a number greater than absolute zero (-273.15°C). You entered: " + trash);
      }

    } while (!done);
  }
}