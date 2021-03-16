package com.altynnikov.se.functionalProgramming.lesson4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        IntStream.range(1, 10)
                .forEach((x) -> System.out.println(x));
        System.out.println();

        IntStream.range(1, 10)
                .skip(5)
                .forEach((x) -> System.out.println(x));
        System.out.println();

        int val = IntStream
                .range(1, 10)
                .sum();
        System.out.println(val);

        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent(x -> System.out.println(x));
        System.out.println();

        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter((x) -> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.println(x + " "));
        System.out.println();

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map((x) -> x * x)
                .average()
                .ifPresent(n -> System.out.println(n));
        System.out.println();

        List<String> listOfItems = Arrays.asList("computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x));
        System.out.println();

        Stream<String> lines = Files.lines(Paths.get("src/files/wordFile.txt"));
        lines.filter(l -> l.length() > 6)
                .sorted()
                .forEach(x -> System.out.println(x + ", "));
        lines.close();
        System.out.println();

        List<String> words = Files.lines(Paths.get("src/files/wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList());
        words.forEach(x -> System.out.println(x + ", "));
        System.out.println();

        Stream<String> rows = Files.lines(Paths.get("src/files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();
        System.out.println(rowCount + " good rows.");
        rows.close();
        System.out.println();

        Stream<String> rows1 = Files.lines(Paths.get("src/files/stockDataCsv.txt"));
        rows1.map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        rows1.close();
    }
}
