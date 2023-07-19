import java.util.Scanner;

public class CiftBul {
   /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
   3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Sayı giriniz: ");
    int sayi=scanner.nextInt();
    int toplam=0;
    int count=0;
    for(int i=0;i<sayi;i++){
      if(i%3==0 && i%4==0){
        toplam+=i;
        count++;
      }
    }
    double ort=toplam/count;
    System.out.println("Ortalama: "+ort);
   }
}
