import java.util.Scanner;

public class Ciftve4 {
  /*
   Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
   ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int toplam = 0;
    while (true) {
      System.out.println("Sayı giriniz: ");
      int sayi = scanner.nextInt();
      if (sayi % 2 == 0 && sayi % 4 == 0) {
        toplam += sayi;
      }
      if (sayi%2==1) {
        break;
      }
    }
    System.out.println(toplam);
  }
}
