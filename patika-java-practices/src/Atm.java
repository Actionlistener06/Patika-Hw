public class Atm {
  public static void main(String[] args) {
    Atm atm = new Atm();
    atm.islemSec();
  }
  public void islemSec(){
    System.out.println("1. Bakiye Sorgulama\n2. Para Yatırma\n3. Para Çekme\n4. Çıkış");
    int islem = 1;
    switch (islem) {
      case 1:
        bakiyeSorgula();
        break;
      case 2:
        paraYatir();
        break;
      case 3:
        paraCek();
        break;
      case 4:
        System.out.println("Çıkış yapılıyor...");
        break;
      default:
        System.out.println("Geçersiz işlem");
        break;
    }
  }
  public void bakiyeSorgula(){
    System.out.println("Bakiyeniz: 1000 TL");
  }
  public void paraYatir(){
    System.out.println("Para yatırma işlemi gerçekleştiriliyor...");
  }
  public void paraCek(){
    System.out.println("Para çekme işlemi gerçekleştiriliyor...");
  }

}
