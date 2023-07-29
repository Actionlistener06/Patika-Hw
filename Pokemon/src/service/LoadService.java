package service;

import model.*;
import model.Character;

import java.util.ArrayList;

public class LoadService {
    public ArrayList<Character> loadCharacters(){
        SpecialPower strategy1 = new Strategy("Strategy", 4, 1);
        SpecialPower strategy2 = new Strategy("Strategy II", 3, 1);

        Character ash = new Ash("Ash", strategy1);
        Character brooke = new Brooke("Brooke", strategy2);

        ArrayList<Character> characterList = new ArrayList<>();
        characterList.add(ash);
        characterList.add(brooke);
        return characterList;
    }

    public ArrayList<Pokemon> loadPokemons(){
        SpecialPower electricty = new Electricty("Electricty", 10, 3);
        SpecialPower water = new Water("Water", 8, 3);
        SpecialPower fire = new Fire("Fire", 9, 3);
        SpecialPower earth = new Earth("Earth", 7, 3);

        Pokemon pokemon1 = new Pikachu("Pikachu", 100, 30, TypeEnum.ELECTRICY, electricty);
        Pokemon pokemon2 = new Sqiurtle("Squirtle", 55, 20, TypeEnum.WATER, water);
        Pokemon pokemon3 = new Charmander("Charmender", 90, 15, TypeEnum.FIRE, fire);
        Pokemon pokemon4 = new Balbausar("Balbausar", 140, 10, TypeEnum.EARTH, earth);

        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);

        return pokemonList;
    }

}
