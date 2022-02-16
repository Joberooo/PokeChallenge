package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] types = new String[]{"fire", "ground", "rock", "water", "bug", "steel", "grass", "ice", "fairy", "dragon"};
        Map<String, DamageRelation> damageByType = new HashMap<>();
        for(String type : types){
            damageByType.put(type, new DamageRelation(type));
        }
        System.out.println(damageByType);
    }
}
