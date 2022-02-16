package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] types = new String[]{"fire", "ground", "rock", "water", "bug", "steel", "grass", "ice", "fairy", "dragon"};
        DamageRelation fireType = new DamageRelation("fire");
        System.out.println(fireType);
    }
}
