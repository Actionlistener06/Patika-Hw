import java.util.Scanner;

public class KullaniciGirisi {
  /*
   Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre 
    ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
     lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
   */
  public static void main(String[] args) {
    String userName, password, newPassword;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kullanıcı adınızı giriniz: ");
    userName = scanner.nextLine();
    System.out.println("Şifrenizi giriniz: ");
    password = scanner.nextLine();
    if (userName.equals("patika") && password.equals("java123")) {
      System.out.println("Giriş yaptınız!");
    } else {
      System.out.println("Bilgileriniz yanlış!");
      System.out.println("Şifrenizi sıfırlamak ister misiniz? (y/n)");
      String cevap = scanner.nextLine();
      if (cevap.equals("y")) {
        System.out.println("Yeni şifrenizi giriniz: ");
        newPassword = scanner.nextLine();
        if (newPassword.equals(password) || newPassword.equals("java123")) {
          System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
          System.out.println("Şifre oluşturuldu.");
        }
      } else {
        System.out.println("Şifre oluşturma işlemi iptal edildi.");
      }
    }
  }
}
