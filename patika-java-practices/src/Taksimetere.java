import java.util.Scanner;

public class Taksimetere {
  //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
  //Taksimetre KM başına 2.20 TL tutmaktadır.
  //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Mesafeyi giriniz: ");
    int km = scanner.nextInt();
    double perKm = 2.20, total, startPrice = 10;
    total = km * perKm;
    total += startPrice;
    total = (total < 20) ? 20 : total;
    System.out.println("Total: " + total);
  }
}
