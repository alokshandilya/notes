public class BinaryToDecimal {
  public static int convertBinToDec(int n) {
    int pow = 0;
    int decNum = 0;
    while(n > 0) {
      int lastDigit = n %10;
      decNum = decNum + (int)(lastDigit * Math.pow(2, pow));
      pow++;
      n = n / 10;
    }
    return decNum;
  }

  public static void main(String[] args) {
    System.out.println(convertBinToDec(101)); // 5
    System.out.println(convertBinToDec(111)); // 7
  }
}
