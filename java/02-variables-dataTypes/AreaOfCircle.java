import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    System.out.print("Enter radius of circle : ");
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();
    sc.close();
    float area = 3.14f * radius * radius; // by default decimal numbers are double
    System.out.println("The area of circle is : " + area);
  }
}
