import java.util.Scanner;

/******************************************************************************************************
  - call by value means calling a method with a parameter as value. through this, the argument value
    is passed to the parameter.
  - call by reference means calling a method with a parameter as a reference. through this, the
    argument reference is passed to the parameter.
  - in call by value, the modification done to the parameter passed does not reflect in the caller's
    scope while in the call by reference, the modification done to the parameter passed are
    persistent and changes are reflected in the caller's scope.
  - there is only call by value in java, not call by reference
******************************************************************************************************/

public class SwapTwoNumbers {
  public static void swapTwoNumbers(int a, int b) {
    int temp = 0;
    temp = a;
    a = b;
    b = temp;
    System.out.println("The numbers after swap are : " + a + " " + b);
  }

  public static void main(String[] args) {
    System.out.print("Enter 2 numbers to swap : ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    swapTwoNumbers(num1, num2);

    System.out.println("The numbers are : " + num1 + " " + num2);

    sc.close();
  }
}
