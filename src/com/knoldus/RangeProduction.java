package com.knoldus;

import java.util.Scanner;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class RangeProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Range: ");
        long input1 = scanner.nextLong();
        long input2 = scanner.nextLong();

        System.out.println(getRangeProduction(input1, input2));
    }

    public static Long getRangeProduction(long i1, long i2) {
        LongBinaryOperator operator = (x, y) -> LongStream.rangeClosed(x, y)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(1l);
        Long result = operator.applyAsLong(i1, i2);
        return result;
    }
}
