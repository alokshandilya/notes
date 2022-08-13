// A
// B C
// D E F
// G H I J

public class CharacterPattern {
  public static void main(String[] args) {
    char n = 4;
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch++;
      }
      System.out.println();
    }
  }
}
