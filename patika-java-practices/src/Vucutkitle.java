import java.util.Scanner;

public class Vucutkitle{
  // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
  // Formül  Kilo (kg) / Boy(m) * Boy(m)
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("BOYUNUZU GİRİNİZ: ");
    double boy=scanner.nextDouble();
    System.out.println("KİLONUZU GİRİNİZ: ");
    double kilo=scanner.nextDouble();
    double endeks=kilo/(boy*boy);
    System.out.println("Vücut Kitle İndeksiniz: "+endeks);
  }

}