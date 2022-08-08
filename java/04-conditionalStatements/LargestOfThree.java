import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    System.out.print("Enter three numbers : ");
    Scanner sc = new Scanner(System.in);
    float number1 = sc.nextFloat();
    float number2 = sc.nextFloat();
    float number3 = sc.nextFloat();
    sc.close();
    float largest;
    // if (number1 > number2) {
    //   if (number1 > number3) {
    //     largest = number1;
    //   } else {
    //     largest = number3;
    //   }
    // } else {
    //   if (number2 > number3) {
    //     largest = number2;
    //   } else {
    //     largest = number3;
    //   }
    // }
    if (number1 > number2 && number1 > number3) {
      largest = number1;
    } else if (number2 > number3) {
      largest = number2;
    } else {
      largest = number3;
    }
    System.out.println("The largest number is : " + largest);
  }
}
