package net.ukr.dreamsicle;

import java.util.ArrayList;
import java.util.Random;

public class FifthBase {
    static int numberOne = 3;
    static int numberTwo = 5;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        /**
         * add 100 random number to array
         */
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }

        /**
         * view items
         */
        list.forEach(FifthBase::getFifthBase);
    }

    private static void getFifthBase(Integer aInt) {
        int first = aInt / 10;
        int second = aInt % 10;

        if (first == numberOne || second == numberOne) {
            System.out.println("fifth");
        }

        if (first == numberTwo || second == numberTwo) {
            System.out.println("base");
        }

        if ((first == numberOne || first == numberTwo) && (second == numberOne || second == numberTwo)) {
            System.out.println(aInt+  " fifth base");
        }
    }
}
