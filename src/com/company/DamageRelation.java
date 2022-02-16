package com.company;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.ArrayList;

public class DamageRelation {
    ArrayList<String> doubleDamageFrom = new ArrayList<>();
    ArrayList<String> doubleDamageTo = new ArrayList<>();
    ArrayList<String> halfDamageFrom = new ArrayList<>();
    ArrayList<String> halfDamageTo = new ArrayList<>();
    ArrayList<String> noDamageFrom = new ArrayList<>();
    ArrayList<String> noDamageTo = new ArrayList<>();

    public DamageRelation(String type) throws IOException {
        String jsonString = PokeRestAPI.getJsonString(type);

        JsonElement jsonElement = new JsonParser().parse(jsonString);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        jsonObject = jsonObject.getAsJsonObject("damage_relations");

        JsonArray jsonArray = jsonObject.getAsJsonArray("double_damage_from");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.doubleDamageFrom.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }

        jsonArray = jsonObject.getAsJsonArray("double_damage_to");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.doubleDamageTo.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }

        jsonArray = jsonObject.getAsJsonArray("half_damage_from");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.halfDamageFrom.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }

        jsonArray = jsonObject.getAsJsonArray("half_damage_to");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.halfDamageTo.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }

        jsonArray = jsonObject.getAsJsonArray("no_damage_from");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.noDamageFrom.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }

        jsonArray = jsonObject.getAsJsonArray("no_damage_to");
        for (int i = 0; i < jsonArray.size(); i++) {
            this.noDamageTo.add(jsonArray.get(i).getAsJsonObject().get("name").getAsString());
        }
    }
}
