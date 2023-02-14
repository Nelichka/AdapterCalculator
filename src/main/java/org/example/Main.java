package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 5));
        System.out.println(intsCalc.mult(5, 5));
        System.out.println(intsCalc.pow(5, 5));
    }
}