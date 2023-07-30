
public class Game {

  public void start() {
    System.out.println("Oyun başlıyor...");
    
    Player player = new Player("Ata", 100, 30, 20);
    player.selectChar();
    System.out.println("Seçtiğiniz karakter: " + player.getName());
    System.out.println("Can: " + player.getHealth());
    System.out.println("Hasar: " + player.getDamage());
    System.out.println("Para: " + player.getMoney());

    System.out.println("====================================");
    
    Obstacle obstacle = new Obstacle("Zombi", 3, 10, 4);
    System.out.println("Karşınıza çıkan engel: " + obstacle.getName());
    System.out.println("Can: " + obstacle.getHealth());
    System.out.println("Hasar: " + obstacle.getDamage());
    
  }

}
