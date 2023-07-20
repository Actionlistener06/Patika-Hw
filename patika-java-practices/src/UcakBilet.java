import java.util.Scanner;

public class UcakBilet {
  /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Mesafeyi km türünden giriniz : ");
  int mesafe = scan.nextInt();
  System.out.print("Yaşınızı giriniz : ");
  int yas = scan.nextInt();
  System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
  int yolculukTipi = scan.nextInt();
  double normalTutar = mesafe * 0.10;
  double yasIndirimi = 0;
  double yolculukTipiIndirimi = 0;
  double indirimliTutar = 0;
  double toplamTutar = 0;
  if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
    if (yas < 12) {
      yasIndirimi = normalTutar * 0.5;
    } else if (yas >= 12 && yas <= 24) {
      yasIndirimi = normalTutar * 0.1;
    } else if (yas >= 65) {
      yasIndirimi = normalTutar * 0.3;
    }
    if (yolculukTipi == 2) {
      yolculukTipiIndirimi = (normalTutar - yasIndirimi) * 0.2;
    }
    indirimliTutar = normalTutar - (yasIndirimi + yolculukTipiIndirimi);
    toplamTutar = yolculukTipi == 1 ? indirimliTutar : indirimliTutar * 2;
    System.out.println("Toplam Tutar = " + toplamTutar + " TL");
  } else {
    System.out.println("Hatalı Veri Girdiniz !");
  }

}
}
