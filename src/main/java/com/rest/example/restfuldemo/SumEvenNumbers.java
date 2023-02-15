package com.rest.example.restfuldemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumEvenNumbers {

    public static int sumOfEvenNumbers() {
        int sumOfEvenNumbers = IntStream.of(32,35,23,24,6,3,2,68,67,22,27).filter(n -> n%2 ==0).sum();
        return sumOfEvenNumbers;
    }

    public static void main(String[] args) {

        System.out.println("Sum of even numbers: "+sumOfEvenNumbers());
    }
}
