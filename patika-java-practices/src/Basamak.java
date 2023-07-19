public class Basamak {
  //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
  public static void main(String[] args) {
    
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Sayı giriniz: ");
    int sayi = scanner.nextInt();
    int toplam = 0;
    while (sayi > 0) {
      toplam += sayi % 10;
      sayi /= 10;
    }
    System.out.println("Basamakların toplamı: " + toplam);
  }
  
}
