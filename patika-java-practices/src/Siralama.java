import java.util.ArrayList;
import java.util.Scanner;

public class Siralama {
  //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> sayilar = new ArrayList<Integer>();
    System.out.println("Birinci sayıyı giriniz: ");
    int a = scanner.nextInt();
    sayilar.add(a);
    System.out.println("İkinci sayıyı giriniz: ");
    int b = scanner.nextInt();
    sayilar.add(b);
    System.out.println("Üçüncü sayıyı giriniz: ");
    int c = scanner.nextInt();
    sayilar.add(c);
    sayilar.sort(null);
    System.out.println(sayilar.toString());
  }
}
