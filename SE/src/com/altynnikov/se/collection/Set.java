package com.altynnikov.se.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);

        for (Integer number: values) {
            System.out.println(number);
        }

        LinkedHashSet<String> strValues = new LinkedHashSet<>();
        strValues.add("Random");
        strValues.add("Animal");
        strValues.add("Zoo");
        strValues.add("Car");
        strValues.add("Car");
        strValues.add("Car");
        strValues.add("People");

        for (String strValue: strValues) {
            System.out.println(strValue);
        }

        HashSet<Animal> animals = new HashSet<>();
        animals.add(new Animal("Dog", 12));
        animals.add(new Animal("Cat", 8));
        animals.add(new Animal("Bird", 3));
        animals.add(new Animal("Dog", 12));
        animals.add(new Animal("Kangaroo", 24));

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}
