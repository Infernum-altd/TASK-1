package com.altynnikov.se.collection;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Brave", "Very long phrase number one");
        dictionary.put("Brilliant", "Very long phrase number two");
        dictionary.put("Joy", "Very long phrase number three");
        dictionary.put("Confidence", "Very long phrase number four");

        dictionary.put("Brilliant", "XXXXXXX");

        for (String word : dictionary.keySet()) {
            System.out.println(dictionary.get(word));
        }

        for (java.util.Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
