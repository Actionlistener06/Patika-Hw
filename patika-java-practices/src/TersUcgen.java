import java.util.Scanner;

public class TersUcgen {
  //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Basamak sayısını giriniz : ");
    int basamak = scanner.nextInt();
    for (int i = 0; i < basamak; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (2 * basamak - 1) - (2 * i); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
