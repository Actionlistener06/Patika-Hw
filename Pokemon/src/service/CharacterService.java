package service;

import model.Ash;
import model.Character;
import model.Pokemon;
import model.SpecialPower;

import java.util.ArrayList;

public class CharacterService {
    public Character createCharacter(String name, SpecialPower specialPower, ArrayList<Pokemon> pokemons){
            return new Character(name, specialPower, pokemons);
    }

}
