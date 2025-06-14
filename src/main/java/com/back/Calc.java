package com.back;

public class Calc {
    static int run(String expression){
        expression = expression.trim();
        String[] exp = new String[2];

        int add = expression.indexOf("+");
        if(add != -1) {
            exp[0] = expression.substring(0, add).trim();
            exp[1] = expression.substring(add + 1).trim();
            return run(exp[0]) + run(exp[1]);
        }

        int sub = expression.indexOf("-");
        if(sub != -1){
            exp[0] = expression.substring(0, sub).trim();
            exp[1] = expression.substring(sub + 1).trim();
            return Integer.parseInt(exp[0]) - Integer.parseInt(exp[1]);
        }

        return Integer.parseInt(expression);
    }
}
