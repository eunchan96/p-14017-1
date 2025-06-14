package com.back;

public class Calc {
    static int run(String expression){
        expression = expression.trim();

        int add = expression.indexOf("+");

        if(add == -1) return Integer.parseInt(expression);
        String[] exp = new String[2];
        exp[0] = expression.substring(0, add).trim();
        exp[1] = expression.substring(add + 1).trim();

        return Integer.parseInt(exp[0]) + Integer.parseInt(exp[1]);
    }
}
