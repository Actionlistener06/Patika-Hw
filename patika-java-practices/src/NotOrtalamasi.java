
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int top=0;
        int mat,fiz,kim,tur,tar,mus;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz");
        mat=scanner.nextInt();
        System.out.println("Fizik notunu giriniz");
        fiz=scanner.nextInt();
        System.out.println("Kimya notunu giriniz");
        kim=scanner.nextInt();
        System.out.println("Turkce notunu giriniz");
        tur=scanner.nextInt();
        System.out.println("Tarih notunnu giriniz");
        tar=scanner.nextInt();
        System.out.println("Muzik noutnu giriniz");
        mus=scanner.nextInt();
        top=mat+fiz+kim+tur+tar+mus;
        double ort=top/6.0;
        if(ort>=60.0){
            System.out.println("GECTI");
        }
        else System.out.println("KALDI");
    }
}
