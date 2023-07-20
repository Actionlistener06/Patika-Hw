import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar uzunluklarini giriniz");
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int c=scanner.nextInt();
        int cevre=a+b+c;
        double alan=Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.println(alan);
        show();
    }
    static void show()
    {
        System.out.println("Show metodu..");
        return;
    }

}
