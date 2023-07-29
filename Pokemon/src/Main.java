import model.*;
import model.Character;
import service.GameService;
import service.LoadService;
import service.PlayerService;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static LoadService loadService = new LoadService();
    static PlayerService playerService = new PlayerService();
    static GameService gameService = new GameService();
    static Scanner sc = new Scanner(System.in);
    // Load characters
    static ArrayList<Character> characterList = loadService.loadCharacters();
    // Load Pokemon
    static ArrayList<Pokemon> pokemonList = loadService.loadPokemons();
    static ArrayList<Player> playerList = new ArrayList<>();

    public static void main(String[] args) {
        int ch = 0;
        do {
            System.out.println("----- Welcome To Pokemon Arena -----");
            System.out.println("1.Player 1");
            System.out.println("2.Player 2");
            System.out.println("3-Start Fight");
            System.out.println("4.Exit");
            System.out.println("Enter Choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> playerChoosen();
                case 2 -> playerChoosen();
                case 3 -> FightMenu();
                case 4 -> System.out.println("Thanks for Using!");
                default -> System.out.println("Invalid Input");
            }
        } while (ch != 4);
    }

    private static void playerChoosen() {
        System.out.println("----- Letter your name Pokemon Master -----");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("----Well done Master " + name + " Now choose your character----");
        int i = 1;
        for (Character character : characterList) {
            System.out.println(i + "-" + character.getName());
            i++;
        }
        int wch = sc.nextInt();
        Character character = characterList.get(wch - 1);
        characterList.remove(character);
        Player player = new Player(name, character);
        System.out.println("Gotta Catch'em ALL " + character.getName());
        pokemonChoosen(player);
    }

    private static void pokemonChoosen(Player player) {
        int wpk = 0;
        do {
            System.out.println("----- Choose your Pokemons -----");
            int a = 1;
            for (Pokemon pokemon : pokemonList) {
                System.out.println(a + "-" + pokemon.getName());
                a++;
            }
            System.out.println("Enter Choice : ");
            System.out.println("5-Return");
            wpk = sc.nextInt();
            if (wpk != 5) {
                player.getCharacter().getPokemonList().add(pokemonList.get(wpk - 1));
                System.out.println("Added!!");
                pokemonList.remove(wpk - 1);
            }
        } while (wpk != 5);
        playerList.add(player);
    }

    private static void FightMenu() {
        if (playerList.size() < 2) {
            System.out.println("Not enough player to start");
        } else {
            Player attacker;
            Player defender;
            boolean specialChar;
            boolean specialPoke;
            attacker = gameService.startingPlayer(playerList);
            System.out.println(attacker.getCharacter().getName() + " Starts the fight");
            int defenderIndex = 1 - playerList.indexOf(attacker);
            defender = playerList.get(defenderIndex);

            Pokemon selectedPoke =pokemonSelect(attacker);
            gameService.fightRound(attacker, defender, selectedPoke);
            System.out.println("New Round Started");
            Pokemon selectedPoke2 =pokemonSelect(attacker);
            gameService.fightRound(attacker, defender, selectedPoke2);
        }
    }
    private static Pokemon pokemonSelect(Player attacker){
        Pokemon choosenPoke;
        System.out.println("Choose your pokemon to fight ");
        int z = 1;
        for (Pokemon pokemon : attacker.getCharacter().getPokemonList()) {
            System.out.println(z + "-" + pokemon.getName());
            z++;
        }
        int idxChoosenPoke = sc.nextInt() - 1;
        choosenPoke = attacker.getCharacter().getPokemonList().get(idxChoosenPoke);
        return choosenPoke;
    }
}