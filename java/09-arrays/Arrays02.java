/*
  - Everything in Java is passed by value. In case of an array (which is nothing but an Object), the array reference is
    passed by value (just like an object reference is passed by value).

  - When we pass an array to other method, actually the reference to that array is copied.

    - Any changes in the content of array through that reference will affect the original array.
    - But changing the reference to point to a new array will not change the existing reference in original method.
*/

public class Arrays02 {
  public static void updateMarks(int n[]) {
    for (int i = 0; i < n.length; i++) {
      n[i] += 1;
    }
  }

  public static void updateMarks(int n) {
    n += 1;
  }

  public static void main(String[] args) {
    int marksComp = 99;
    updateMarks(marksComp);
    System.out.println(marksComp); // 99
    System.out.println();
    int marks[] = {94, 97, 99};
    updateMarks(marks);
    for (int i = 0; i < marks.length; i++) {
      System.out.println(marks[i]);
    }
  }
}

/************** OUTPUT ********************
 *  99
 *
 *  95
 *  98
 *  100
 *****************************************/
