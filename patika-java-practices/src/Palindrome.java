public class Palindrome {
  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    palindrome.isPalindrome();
  }
  public void isPalindrome(){
    int sayi = 12321;
    int birlerBasamagi = sayi % 10;
    int onlarBasamagi = (sayi / 10) % 10;
    int yuzlerBasamagi = (sayi / 100) % 10;
    int binlerBasamagi = sayi / 1000;
    if (birlerBasamagi == binlerBasamagi && onlarBasamagi == yuzlerBasamagi) {
      System.out.println("Bu bir Palindrome sayısıdır.");
    } else {
      System.out.println("Bu bir Palindrome sayısı değildir.");
    }
  }
}
