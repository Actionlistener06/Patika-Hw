import java.util.Scanner;

public class Harmonik {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
     double toplam = 0;
    for (double i = 1; i <= a; i++) {
      toplam += (1 / i);
    }
    System.out.println("Harmonik serinin toplamı: " + toplam);
  }
  }
  
