package com.knoldus;

import java.util.Scanner;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class RangeProduction {
    public static void main(String[] args) {
    LongBinaryOperator operator = (x, y) -> LongStream.rangeClosed(x, y)
            .reduce((num1, num2) -> num1 * num2)
            .orElse(1l);


        Scanner scanner =new Scanner(System.in);
        System.out.println("Insert Range: ");
        long input1=scanner.nextLong();
        long input2=scanner.nextLong();
        Long result = operator.applyAsLong(input1, input2);
        System.out.println(result);
}
}
