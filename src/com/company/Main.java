package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CalcDamage calcDamage = new CalcDamage();

        calcDamage.calcCompleteDamage("fire", "grass");
        calcDamage.calcCompleteDamage("fighting", new String[]{"ice", "rock"});
        calcDamage.calcCompleteDamage("psychic", new String[]{"poison", "dark"});
        calcDamage.calcCompleteDamage("water", "normal");
        calcDamage.calcCompleteDamage("fire", "rock");
    }
}
