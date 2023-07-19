public class Armstrong {
  public static void main(String[] args) {
    Armstrong armstrong = new Armstrong();
    armstrong.isArmstrong();
  }
  public void isArmstrong(){
    int sayi = 153;
    int birlerBasamagi = sayi % 10;
    int onlarBasamagi = (sayi / 10) % 10;
    int yuzlerBasamagi = sayi / 100;
    int sonuc = (birlerBasamagi * birlerBasamagi * birlerBasamagi) + (onlarBasamagi * onlarBasamagi * onlarBasamagi) + (yuzlerBasamagi * yuzlerBasamagi * yuzlerBasamagi);
    if (sayi == sonuc) {
      System.out.println("Bu bir Armstrong sayısıdır.");
    } else {
      System.out.println("Bu bir Armstrong sayısı değildir.");
    }
  }
}
