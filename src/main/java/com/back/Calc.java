package com.back;

public class Calc {
//    @Contract(pure = true)
    static int run(String expression){
        expression = expression.trim();

        String[] exp;
        int[] expInt = new int[2];

        if ((exp = expression.split("\\+", 2)).length == 2) {
            expInt[0] = run(exp[0].trim());
            expInt[1] = run(exp[1].trim());
            return expInt[0] + expInt[1];
        } else if((exp = expression.split("-", 2)).length == 2) {
            expInt[0] = run(exp[0].trim());
            expInt[1] = run(exp[1].trim());
            return expInt[0] - expInt[1];
        } else {
            return Integer.parseInt(expression.trim());
        }

    }
}
