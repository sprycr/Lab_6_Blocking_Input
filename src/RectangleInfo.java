import java.lang.Math;
import java.util.Scanner;

public class RectangleInfo {
  public static void main(String[] args) {
    double length = 0;
    double width = 0;
    double area;
    double perimeter;
    double diagonal;
    String trash = "";
    boolean done = false;
    System.out.println("Please enter the length of a rectangle:");
    Scanner in = new Scanner(System.in);
    do {
      if (in.hasNextDouble()) {
        length = in.nextDouble();
        in.nextLine();
        done = true;

      } else {
        trash = in.nextLine();
        System.out.println("Please input a valid length for the rectangle. You entered: " + trash);
      }

    } while (!done);
    done = false;
    System.out.println("Please enter the width of a rectangle:");
    do {
      if (in.hasNextDouble()) {
        width = in.nextDouble();
        in.nextLine();
        done = true;

      } else {
        trash = in.nextLine();
        System.out.println("Please input a valid width for the rectangle. You entered: " + trash);
      }
    } while (!done);
    // logic
    area = length * width;
    perimeter = 2 * (length + width);
    diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
    System.out.println("Area of rectangle: " + area);
    System.out.println("Perimeter of rectangle: " + perimeter);
    System.out.println("diagonal length of rectangle: " + diagonal);
  }
}
