import java.util.Scanner;

public class Recursive2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bir sayı giriniz : ");
    int sayi = scanner.nextInt();
    fiveSub(sayi);
  }
  //subtract five until it reaches zero then add five until it reaches the number
  static void fiveSub(int sayi) {
    if (sayi > 0) {
      System.out.println(sayi);
      fiveSub(sayi - 5);
    } else {
      System.out.println(sayi);
      fiveAdd(sayi + 5);
    }
  }
  private static void fiveAdd(int i) {
    fiveAdd(i + 5);
  }
}
