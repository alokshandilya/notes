public class DecimalToBinary {
  public static int binToDec(int n) {
    int pow = 0;
    int binNum = 0;

    while (n > 0) {
      int rem = n % 2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    return binNum;
  }

  public static void main(String[] args) {
    System.out.println(binToDec(1)); // 1
    System.out.println(binToDec(5)); // 101
    System.out.println(binToDec(8)); // 1000
    System.out.println(binToDec(9)); // 1001
  }
}
