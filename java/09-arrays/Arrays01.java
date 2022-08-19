import java.util.Scanner;

// what is array?
// collection of similar type of elements having contiguous memory location

public class Arrays01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int array1[] = new int[5];
    int array2[] = {1, 2, 3};
    String array3[] = {"Alok", "Shandilya"};
    String array4[] = new String[3];
    System.out.println("Array 1 length : " + array1.length); // 5
    System.out.println("Array 2 length : " + array2.length); // 3
    System.out.println("Array 3 length : " + array3.length); // 2

    for (int i = 0; i < array1.length; i++) {
      System.out.print(array1[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < array4.length; i++) {
      System.out.print(array4[i] + " ");
    }
    System.out.println();
    System.out.println("Enter String elements for array4");
    array4[0] = sc.next();
    array4[1] = sc.next();
    array4[2] = sc.next();

    for (int i = 0; i < array4.length; i++) {
      System.out.print(array4[i] + " ");
    }
    System.out.println();

    sc.close();
  }
}

/************** OUTPUT ********************
 *  Array 1 length : 5
 *  Array 2 length : 3
 *  Array 3 length : 2
 *  0 0 0 0 0
 *  null null null
 *  Enter String elements for array4
 *  alok
 *  shandilya
 *  pro
 *  alok shandilya pro
 *****************************************/
