public class ManavKasa {
  /*
   Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre 
   toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
   */
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
    System.out.println("Armut kaç kilo ? : ");
    double armutKilo = scanner.nextDouble();
    System.out.println("Elma kaç kilo ? : ");
    double elmaKilo = scanner.nextDouble();
    System.out.println("Domates kaç kilo ? : ");
    double domatesKilo = scanner.nextDouble();
    System.out.println("Muz kaç kilo ? : ");
    double muzKilo = scanner.nextDouble();
    System.out.println("Patlıcan kaç kilo ? : ");
    double patlicanKilo = scanner.nextDouble();
    double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo)
        + (patlican * patlicanKilo);
    System.out.println("Toplam Tutar : " + toplam + " TL");
}
}
