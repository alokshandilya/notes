import java.util.Scanner;

public class Bill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter price of pencil, pen and eraser : ");
    float priceOfPencil = sc.nextFloat();
    float priceOfPen = sc.nextFloat();
    float priceOfEraser = sc.nextFloat();
    sc.close();
    float totalPrice = priceOfPencil + priceOfPen + priceOfEraser;
    System.out.println("Total price is : " + totalPrice);
    System.out.println("Total price with GST (18%) : " + (totalPrice + (totalPrice * 0.18f)));
  }
}
