package service;

import model.Pokemon;
import model.WeatherTypeEnum;

import java.util.ArrayList;
import java.util.Random;

public class WeatherService {
    public void weatherEffect(Pokemon pokemon, WeatherTypeEnum weatherEnum) {

        switch (pokemon.getType().toString()) {

            case "WATER" -> {
                if (weatherEnum == WeatherTypeEnum.RAINY) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Squirtle got extra power from Rain.");
                } else if (weatherEnum == WeatherTypeEnum.SUNNY) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Squirtle lost power in SUN");
                }
            }
            case "FIRE" -> {
                if (weatherEnum == WeatherTypeEnum.SUNNY) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Charmander got extra power from SUN");
                } else if (weatherEnum == WeatherTypeEnum.RAINY) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Charmender lost power in RAIN");
                }
            }
            case "WINDY" -> {
                if (weatherEnum == WeatherTypeEnum.WINDY) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Bulbasaour got extra power from WIND");
                } else if (weatherEnum == WeatherTypeEnum.SUNNY) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Bulbasaur lost power in SUN");
                }
            }
            case "ELECTRICY" -> {
                if (weatherEnum == WeatherTypeEnum.RAINY) {
                    pokemon.setDamage((pokemon.getDamage() * 15 / 10));
                    System.out.println("Pikachu got extra power from RAIN");
                } else if (weatherEnum == WeatherTypeEnum.WINDY) {
                    pokemon.setDamage((pokemon.getDamage() * 5 / 10));
                    System.out.println("Pikachu lost power in WIND");
                }
            }
        }
    }
}
