import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Tutar giriniz");
        tutar=scanner.nextDouble();
        if(tutar>1000){
            kdvOran=0.08;
        }
        double KDV=tutar*kdvOran;
        double KDVlitutar=tutar+KDV;
        System.out.println("KDV tutari: "+KDV+"\nKDV eklenmis tutar: "+KDVlitutar);
    }
}
