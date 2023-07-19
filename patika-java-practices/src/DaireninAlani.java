import java.util.Scanner;

public class DaireninAlani {
//  Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

//𝜋 sayısını = 3.14 alınız.

//Formül : (𝜋 * (r*r) * 𝛼) / 360
  
  public static void main(String[] args) {
    System.out.println("Yarıçapı giriniz: ");  
    Scanner scanner = new Scanner(System.in);
    int r =scanner.nextInt();
    System.out.println("Merkez açısının ölçüsünü giriniz: ");
    int a = scanner.nextInt();   
    double pi = 3.14;
    
    double alan = (pi * (r * r) * a) / 360;
    System.out.println("Dairenin alanı: " + alan);
  }
}
