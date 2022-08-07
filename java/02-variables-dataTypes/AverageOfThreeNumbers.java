import java.util.Scanner;

public class AverageOfThreeNumbers {
  public static void main(String[] args) {
    System.out.print("Input three numbers : ");
    Scanner sc = new Scanner(System.in);
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    float num3 = sc.nextFloat();
    sc.close();
    float average = (num1 + num2 + num3) / 3; // 3 to float (widening/implicit conversion)
    System.out.println("The average is : " + average);
  }
}
