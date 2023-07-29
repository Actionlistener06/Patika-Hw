import java.util.Scanner;

public class ClosestinArray {
//  Dizi : {15,12,788,1,-1,-778,2,0}
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int[] list = {15,12,788,1,-1,-778,2,0};
  int min = list[0];
  int max = list[0];
  int input = scanner.nextInt();
  for (int i : list) {
    if (Math.abs(input - i) < Math.abs(input - min)) {
      min = i;
    }
    if (Math.abs(input - i) > Math.abs(input - max)) {
      max = i;
    }
  }
  System.out.println("Closest number to " + input + " is " + min);
  System.out.println("Furthest number to " + input + " is " + max);
  scanner.close();
}
}
