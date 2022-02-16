package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] types = new String[]{"fire", "ground", "rock", "water", "bug", "steel", "grass", "ice", "fairy",
                "dragon", "psychic", "fighting", "poison", "dark", "normal"};

        CalcDamage calcDamage = new CalcDamage(types);

        calcDamage.calcCompleteDamage("fire", "grass");
        calcDamage.calcCompleteDamage("fighting", new String[]{"ice", "rock"});
        calcDamage.calcCompleteDamage("psychic", new String[]{"poison", "dark"});
        calcDamage.calcCompleteDamage("water", "normal");
        calcDamage.calcCompleteDamage("fire", "rock");
    }
}
