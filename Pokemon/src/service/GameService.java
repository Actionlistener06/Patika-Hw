package service;

import model.Character;
import model.Player;
import model.Pokemon;
import model.WeatherTypeEnum;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameService {
    WeatherService weatherService = new WeatherService();

    public int attack(Player attacker, Player defender,
                       boolean isPokeSpecialAttack, boolean isCharSpecialAttack,Pokemon attackingPokemon) {
        Pokemon defendingPokemon = defender.getCharacter().getPokemonList().get(0);
        WeatherTypeEnum randomWeather=WeatherTypeEnum.getRandomWeather();
        weatherService.weatherEffect(attackingPokemon,randomWeather);

        int damage = 0;
                int charRemainingRights = attacker.getCharacter().getSpecialPower().getRemainingRights();
                int pokeRemainingRights= attackingPokemon.getSpecialPower().getRemainingRights();
            if (isPokeSpecialAttack && isCharSpecialAttack) {
                damage += attackingPokemon.specialAttack();
                damage += attacker.getCharacter().getSpecialPower().getExtraDamage();
                attacker.getCharacter().getSpecialPower().setRemainingRights(charRemainingRights - 1);
                attackingPokemon.getSpecialPower().setRemainingRights(pokeRemainingRights-1);
            } else if (isPokeSpecialAttack) {
                damage += attackingPokemon.specialAttack();
                attackingPokemon.getSpecialPower().setRemainingRights(pokeRemainingRights-1);
            } else if(isCharSpecialAttack) {
                damage += attackingPokemon.getDamage();
                damage += attacker.getCharacter().getSpecialPower().getExtraDamage();
                attacker.getCharacter().getSpecialPower().setRemainingRights(charRemainingRights - 1);
            }
            else{
                damage += attackingPokemon.getDamage();
            }
            defendingPokemon.setHealth(defendingPokemon.getHealth() - damage);
            return damage;
    }
    public boolean healthCheck(Player player){
        if(player.getCharacter().getPokemonList().get(0).getHealth() > 0){
            System.out.println("Oyun devam ediyor.");
            return true;

        } else {
            System.out.println(player.getName() + " oyunu kaybetti");
            return false;
        }
    }
    public Player startingPlayer(ArrayList<Player> players){
        Random random = new Random();
        return players.get(random.nextInt(1));
    }
    public boolean isAbleToSpecialPoke(Pokemon pokemon) {
        if (pokemon.getSpecialPower().getRemainingRights()>0) {
            return true;
        }
        else {
            System.out.println("You got no enough power to make special attack");
            return false;
        }
    }
    public boolean isAbleToSpecialChar(Character character){
        if(character.getSpecialPower().getRemainingRights()>0){
            return true;
        }
        else {
            System.out.println("You got no enough power to make special attack");
            return false;
        }
    }
    public Pokemon weakestPoke(Player player){
        ArrayList<Pokemon> poklist=player.getCharacter().getPokemonList();
        int maxDamage=Integer.MAX_VALUE;
        Pokemon WeakPoke = new Pokemon();
        for(Pokemon pokemon : poklist){
            if(pokemon.getDamage()<maxDamage){
                maxDamage=pokemon.getDamage();
                WeakPoke=pokemon;
            }
        }
        return WeakPoke;
    }

    public GameService fightRound(Player attacker, Player defender, Pokemon choosenPoke) {
        boolean isCharSpecialAtttack=false;
        boolean isPokeSpecialAttack=false;
        if(isAbleToSpecialChar(attacker.getCharacter())){
           isCharSpecialAtttack= isCharacterSpecialAttack();
        }
        if(isAbleToSpecialPoke(choosenPoke)){
           isPokeSpecialAttack= isPokemonSpecialAttack();
       }
          int damage =attack(attacker, defender, isCharSpecialAtttack, isPokeSpecialAttack,choosenPoke);

                System.out.println(attacker.getName()+" "+choosenPoke.getName()+" "+"ile saldirdi ve "+damage+" hasar verdi.");
               if(!healthCheck(defender)){
               System.out.println("Round over");
                   Pokemon switchingPoke = defender.getCharacter().getPokemonList().get(0);
                   Pokemon swtichingPoke2 = weakestPoke(attacker);
                   switchingPoke.setHealth(100);
                   defender.getCharacter().getPokemonList().remove(0);
                   attacker.getCharacter().getPokemonList().add(switchingPoke);
                   defender.getCharacter().getPokemonList().add(swtichingPoke2);
              }
               else return fightRound(attacker,defender,choosenPoke);
        return null;
    }
    public boolean isPokemonSpecialAttack() {
        Scanner scanner = new Scanner(System.in);
        boolean pokemonSpecialAttack=false;
        System.out.print("Do you want to use special attack for Pokemon?(y/n)");
        String firstPlayerPokemonSpecialAttack = scanner.nextLine().toLowerCase();

        pokemonSpecialAttack = firstPlayerPokemonSpecialAttack.equals("y");
        return pokemonSpecialAttack;
    }

    public boolean isCharacterSpecialAttack() {
        Scanner scanner = new Scanner(System.in);
        boolean characterSpecialAttack=false;
        System.out.print("Do you want to use special attack for Character?(y/n)");
        String firstPlayerCharacterSpecialAttack = scanner.nextLine().toLowerCase();

        characterSpecialAttack = firstPlayerCharacterSpecialAttack.equals("y");
        return characterSpecialAttack;
    }

}
