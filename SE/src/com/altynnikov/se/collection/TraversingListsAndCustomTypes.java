package com.altynnikov.se.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TraversingListsAndCustomTypes {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("lion");
        animal.add("cat");
        animal.add("dog");
        animal.add("bird");

/*        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }

        for (String value : animal) {
            System.out.println(value);
        }*/

        List<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 12000, false);
        vehicles.add(new Vehicle("Honda", "Acord", 12000, false));
        vehicles.add(vehicle);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

/*        for (Vehicle car : vehicles) {
            System.out.println(car);
        }*/

        printElementOfList(vehicles);
        printElementOfList(animal);
    }

    public static void printElementOfList(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}
