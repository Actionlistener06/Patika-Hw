public class Uslusayi {
  //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Taban değerini giriniz: ");
    int taban = scanner.nextInt();
    System.out.println("Üs değerini giriniz: ");
    int us = scanner.nextInt();
    int sonuc = 1;
    for (int i = 1; i <= us; i++) {
      sonuc *= taban;
    }
    System.out.println("Sonuç: " + sonuc);
  }
}
