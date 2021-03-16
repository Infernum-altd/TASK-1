package com.altynnikov.se.functionalProgramming.lesson1And2;

public class App {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.walk();

        Robot wale = new Robot();
        wale.walk();

        walker(new Walkable() {
            @Override
            public void walk() {
                System.out.println("Custom object walking");
            }
        });

        walker(() -> System.out.println("Lambda walking"));

        ALambdaInterface aBlockOfCode = () -> {
            System.out.println("Some custom logic");
            System.out.println("Some custom logic");
        };

        Walkable aBlockOfCode2 = () -> {
            System.out.println("Some custom logic");
            System.out.println("Some custom logic");
        };

        walker(aBlockOfCode2);

        ALambdaInterface helloVar = () -> System.out.println("Hello");

        Calculate sumVar = (a, b) -> a + b;

        helloVar.someMethod();
        System.out.println(sumVar.compute(4, 6));

        Calculate nonZeroDivider = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };

        System.out.println(nonZeroDivider.compute(10, 4));

        StringWorker reverser = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println(reverser.work("Word"));

        NumberWorker computedNumber = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(computedNumber.compute(10));

        MyGeneric<String> reverser1 = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println(reverser.work("Word"));

        MyGeneric<Integer> computedNumber1 = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(computedNumber1.work(10));
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDivide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = i * result;
        }
        return result;
    }

    public static void walker(Walkable walkerEntity) {
        walkerEntity.walk();
    }
}

interface Calculate {
    int compute(int arg1, int arg2);
}

interface StringWorker {
    String work(String s);
}

interface NumberWorker {
    int compute(int arg1);
}

interface MyGeneric<T> {
    public T work(T t);
}
