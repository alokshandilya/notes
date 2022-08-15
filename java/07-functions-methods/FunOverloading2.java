// using datatypes
// datatypes don't matter in function overloading
// public static int sum(int a, int b) and
// public static float sum(int a, int b) will give error [method already defined]
public class FunOverloading2 {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(sum(5, 9));
    System.out.println(sum(5.4f, 9.6f));
  }
}
