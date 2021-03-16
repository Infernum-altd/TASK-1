package com.altynnikov.se.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class IntroduceToCollection {
    public static void main(String[] args) {
        ArrayList words = new ArrayList();
        words.add("hello");
        words.add("there");
        words.add(10);
        words.add(9);
        words.add(12.00);
        words.add("H");

        int item1 = (int) words.get(2);
        int item2 = (int) words.get(3);
        System.out.println(item1 + item2);

        ArrayList<String> genericWords = new ArrayList();
        genericWords.add("hello");
        genericWords.add("there");
        genericWords.add("10");
        String genericItem1 = genericWords.get(2);
        System.out.println(genericItem1);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.remove();

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
