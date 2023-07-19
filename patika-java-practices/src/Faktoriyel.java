public class Faktoriyel {
  //Java ile faktöriyel hesaplayan programı yazınız.
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Sayı giriniz: ");
    int sayi = scanner.nextInt();
    int faktoriyel = 1;
    for (int i = 1; i <= sayi; i++) {
      faktoriyel *= i;
    }
    System.out.println("Faktöriyel: " + faktoriyel);
  }
}
