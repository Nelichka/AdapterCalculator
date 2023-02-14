package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 3));
        System.out.println(intsCalc.sum(15, 12));
        System.out.println(intsCalc.pow(5, 3));
    }
}