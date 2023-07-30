import java.util.Scanner;

public class MayinTarlasi {
  //Java dilinde, çok boyutlu diziler ile oluşturulmuş Mayın Tarlası oyunu yapıyoruz.
  //Mayın tarlası oyununu tek boyutlu diziler üzerinden yapmaya çalıştık ancak iki boyutlu diziler ile daha kolay yapılabileceğini düşünerek bu şekilde denemek istedik.
  public static void main(String[] args) {
    int[][] map = new int[10][10];
    int[][] board = new int[10][10];
    int row, column;
    int count = 0;
    while (count < 10) {
      row = (int) (Math.random() * 10);
      column = (int) (Math.random() * 10);
      if (map[row][column] != 1) {
        map[row][column] = 1;
        count++;
      }
    }
    System.out.println("Mayınların Konumu");
    for (int i = 0; i < map.length; i++) {
      System.out.println("---------------------");
      for (int j = 0; j < map[i].length; j++) {
        System.out.print("|" + map[i][j] + "\t");
      }
      System.out.println("|");
    }
    System.out.println("---------------------");
    System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
    int right = 0;
    Scanner scanner = new Scanner(System.in);
    while (right < 90) {
      System.out.print("Satır Giriniz : ");
      row = scanner.nextInt();
      System.out.print("Sütun Giriniz : ");
      column = scanner.nextInt();
      if (row < 0 || row >= 10) {
        System.out.println("Satır sayısı 0-9 arasında olmalıdır.");
        continue;
      } else if (column < 0 || column >= 10) {
        System.out.println("Sütun sayısı 0-9 arasında olmalıdır.");
        continue;
      }
      if (map[row][column] == 1) {
        System.out.println("Mayına bastınız! Oyunu kaybettiniz!");
        break;
      } else {
        if (row - 1 >= 0 && row - 1 < 10) {
          if (map[row - 1][column] == 1) {
            board[row][column]++;
          }
        }
        if (row + 1 >= 0 && row + 1 < 10) {
          if (map[row + 1][column] == 1) {
            board[row][column]++;
          }
        }
        if (column - 1 >= 0 && column - 1 <
        10) {
          if (map[row][column - 1] == 1) {
            board[row][column]++;
          }
        }
        if (column + 1 >= 0 && column + 1 < 10) {
          if (map[row][column + 1] == 1) {
            board[row][column]++;
          }
        }
        if (row - 1 >= 0 && row - 1 < 10 && column - 1 >= 0 && column - 1 < 10) {
          if (map[row - 1][column - 1] == 1) {
            board[row][column]++;
          }
        }
        if (row - 1 >= 0 && row - 1 < 10 && column + 1 >= 0 && column + 1 < 10) {
          if (map[row - 1][column + 1] == 1) {
            board[row][column]++;
          }
        }
        if (row + 1 >= 0 && row + 1 < 10 && column - 1 >= 0 && column - 1 < 10) {
          if (map[row + 1][column - 1] == 1) {
            board[row][column]++;
          }
        }
        if (row + 1 >= 0 && row + 1 < 10 && column + 1 >= 0 && column + 1 < 10) {
          if (map[row + 1][column + 1] == 1) {
            board[row][column]++;
          }
        }
        right++;
        System.out.println("Mayınlar...");
        for (int i = 0; i < board.length; i++) {
          System.out.println("---------------------");
          for (int j = 0; j < board[i].length; j++) {
            System.out.print("|" + board[i][j] + "\t");
          }
          System.out.println("|");
        }
        System.out.println("---------------------");
        if (right == 90) {
          System.out.println("Tebrikler! Tüm mayınları buldunuz!");
        }
      }
   }
    scanner.close();
  }
}
