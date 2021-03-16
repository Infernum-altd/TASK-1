package com.altynnikov.se.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(43);
        list.add(15);
        list.add(67);
        list.add(43);
        list.add(10);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(10);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.contains(15));

        list.retainAll(newList);
        System.out.println(list);

/*        list.removeAll(newList);
        System.out.println(list);*/

        List<Integer> li = new ArrayList<>();

        list.clear();
        System.out.println(list);


        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);

        ArrayList<Integer> myList = new ArrayList<>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        HashSet<String> strHashSet = new HashSet<>();
        strHashSet.add("Random");
        strHashSet.add("Tooth Brush");
        strHashSet.add("Computer");
        strHashSet.add("Cloths");


        ArrayList<String> strMyList = new ArrayList<>(strHashSet);
        Collections.sort(strMyList);
        System.out.println(strMyList);

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Employee("Mike", 3500, "Accounting"));
        employeeHashSet.add(new Employee("Paul", 3000, "Admin"));
        employeeHashSet.add(new Employee("Peter", 4000, "IT"));
        employeeHashSet.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> employees = new ArrayList<>(employeeHashSet);

        Collections.sort(employees);
        System.out.println(employees);

    }
}
