import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Birinci sayıyı giriniz: ");
    int a = scanner.nextInt();
    System.out.println("İkinci sayıyı giriniz: ");
    int b = scanner.nextInt();
    System.out.println("İşlemi giriniz: ");
    scanner.nextLine();
    String islem = scanner.nextLine();
    switch (islem) {
      case "+":
        System.out.println("Toplam: " + (a + b));
        break;
      case "-":
        System.out.println("Fark: " + (a - b));
        break;
      case "*":
        System.out.println("Çarpım: " + (a * b));
        break;
      case "/":
        System.out.println("Bölüm: " + (a / b));
        break;
      default:
        System.out.println("Yanlış bir işlem girdiniz!");
    }
  
}
}
