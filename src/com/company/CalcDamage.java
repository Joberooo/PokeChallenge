package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CalcDamage {
    private final Map<String, DamageRelation> damageByType = new HashMap<>();

    public CalcDamage() throws IOException {

        String[] types = new String[]{"fire", "ground", "rock", "water", "bug", "steel", "grass", "ice", "fairy",
                "dragon", "psychic", "fighting", "poison", "dark", "normal"};
        for(String type : types){
            damageByType.put(type, new DamageRelation(type));
        }
    }

    public void calcCompleteDamage(String attackerType, String[] defenderTypes){
        float damage = 1;

        DamageRelation attackerDamageRelation = damageByType.get(attackerType);

        for(String defenderType : defenderTypes){
            damage = calcSingleDamage(attackerDamageRelation, defenderType, damage);
        }

        System.out.println(damage + "x");
    }

    public void calcCompleteDamage(String attackerType, String defenderType){
        DamageRelation attackerDamageRelation = damageByType.get(attackerType);

        float damage = calcSingleDamage(attackerDamageRelation, defenderType, 1);

        System.out.println(damage + "x");
    }

    private float calcSingleDamage(DamageRelation attackerDamageRelation, String defenderType, float damage){
        for(String type : attackerDamageRelation.doubleDamageTo){
            if(Objects.equals(type, defenderType)){
                damage *= 2;
            }
        }

        for(String type : attackerDamageRelation.halfDamageTo){
            if(Objects.equals(type, defenderType)){
                damage *= 0.5;
            }
        }

        for(String type : attackerDamageRelation.noDamageTo){
            if(Objects.equals(type, defenderType)){
                damage *= 0;
            }
        }

        return damage;
    }
}
