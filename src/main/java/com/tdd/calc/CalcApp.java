package com.tdd.calc;

public class CalcApp {
    public static int run(String exp) {
        boolean needToPlus = exp.contains("+");
        boolean needToMinus = exp.contains("-");
        boolean needToMulti = exp.contains("*");
        boolean needToDivide = exp.contains("/");

        String[] bits = null;

        if (needToPlus) {
            bits = exp.split(" \\+ ");
        } else if (needToMinus) {
            bits = exp.split(" \\- ");
        } else if (needToMulti) {
            bits = exp.split(" \\* ");
        } else if (needToDivide) {
            bits = exp.split(" \\/ ");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        if (needToPlus) {
            return a + b;
        } else if (needToMinus) {
            return a - b;
        } else if (needToMulti) {
            return a * b;
        } else if (needToDivide) {
            return a / b;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }
}
