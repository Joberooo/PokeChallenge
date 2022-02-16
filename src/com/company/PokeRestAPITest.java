package com.company;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PokeRestAPITest {

    @Test
    void demoTestMethod() {
        //given
        String[] types = new String[]{"fire", "ground", "rock", "water", "bug", "steel", "grass", "ice", "fairy",
                "dragon", "psychic", "fighting", "poison", "dark", "normal"};

        CalcDamage calcDamage = null;
        try {
            calcDamage = new CalcDamage(types);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //expect
        assertNotNull(calcDamage);
        assertEquals(2.0, calcDamage.calcCompleteDamage("fire", "grass"));
        assertEquals(4.0, calcDamage.calcCompleteDamage("fighting", new String[]{"ice", "rock"}));
        assertEquals(0.0, calcDamage.calcCompleteDamage("psychic", new String[]{"poison", "dark"}));
        assertEquals(1.0, calcDamage.calcCompleteDamage("water", "normal"));
        assertEquals(0.5, calcDamage.calcCompleteDamage("fire", "rock"));
    }
}