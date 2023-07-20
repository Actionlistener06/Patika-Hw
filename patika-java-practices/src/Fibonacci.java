import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Eleman sayisi giriniz : ");
    int elemanSayisi = scanner.nextInt();
    int birinciSayi = 0;
    int ikinciSayi = 1;
    int ucuncuSayi;
    System.out.print(birinciSayi + " " + ikinciSayi);
    for (int i = 2; i < elemanSayisi; i++) {
      ucuncuSayi = birinciSayi + ikinciSayi;
      System.out.print(" " + ucuncuSayi);
      birinciSayi = ikinciSayi;
      ikinciSayi = ucuncuSayi;
    }
  }
}
