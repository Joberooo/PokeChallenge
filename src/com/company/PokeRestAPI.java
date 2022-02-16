package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class PokeRestAPI {
    public static String getJsonString(String type) throws IOException{
        String url = "https://pokeapi.co/api/v2/type/" + type;
        URLConnection connection = new URL(url).openConnection();
        connection.connect();

        BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        String line;
        while((line = r.readLine()) != null){
            sb.append(line);
        }

        return String.valueOf(sb);
    }
}
