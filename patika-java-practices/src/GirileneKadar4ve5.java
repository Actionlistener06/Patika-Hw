public class GirileneKadar4ve5 {
  //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Sayı giriniz: ");
    int sayi = scanner.nextInt();
    for (int i = 1; i <= sayi; i++) {
      if (i % 4 == 0 || i % 5 == 0) {
        System.out.println(i);
      }
    }
  }
}
