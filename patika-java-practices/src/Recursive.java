import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Recursive {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bir sayı giriniz : ");
    int sayi = scanner.nextInt();
    System.out.println("Us giriniz : ");
    int us = scanner.nextInt();
    System.out.println(usAl(sayi, us));

  }
  static int usAl(int sayi, int us) {
    if (us == 0) {
      return 1;
    } else if (us == 1) {
      return sayi;
    } else {
      return sayi * usAl(sayi, us - 1);
    }
  }
  
}
