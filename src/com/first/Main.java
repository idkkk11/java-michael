package com.first;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(addition());
        System.out.println(forLoop());
        System.out.println(forEachLoop());
        printLnHelloTest();

        Note myNote = new Note ("This is my first note.");

        System.out.println(myNote.content);

        ArrayList<String> people = new ArrayList<>();

        people.add("John");
        people.add("Dave");
        people.add("Jane");
        people.add("Mary");
        people.add("Bob");

        people.remove("Dave");
        people.remove(1 );

        System.out.println(people);

        HashMap<String, String> dictionarySample = new HashMap<>();

        dictionarySample.put("Apple", "Fruit");
        dictionarySample.put("Orange", "Fruit");
        dictionarySample.put("Celery", "Vegetable");
        dictionarySample.put("Tomato", "Fruit");

        System.out.println(dictionarySample.get("Orange"));

    }

    public static int addition() {
        int number1 = 200;
        int number2 = 300;
        return number1 + number2;
    }

    public static int forLoop() {
        int sum = 0;
        for (int i=0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static float forEachLoop() {
        float[] theValues = {10.0f, 15.0f, 20.0f};
        float sum = 0.0f;

        for (float currentVal : theValues) {
            sum += currentVal;
        }

        return sum;
    }

    public static void printLnHelloTest() {
        System.out.println("Hello Test");
    }
}