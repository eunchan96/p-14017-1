package com.back;

public class Calc2 {
    static int run(String expression){
        expression = expression.trim();

        String[] exp = new String[3];
        int index;

        index = expression.indexOf('(');
        if (index != -1){
            String subExpression = expression.substring(index);
            int index2=0;

            for(int i=0, count1=0, count2=0; i<subExpression.length(); i++){
                if (subExpression.charAt(i) == '(') count1++;
                if (subExpression.charAt(i) == ')') count2++;
                if (count1 == count2) {
                    index2 = index + i;
                    break;
                }
            }

            exp[0] = "";
            exp[2] = "";
            if(index != 0) {
                exp[0] = expression.substring(0, index).trim();
            }
            if(index2 != expression.length()-1) {
                exp[2] = expression.substring(index2+1).trim();
            }

            int exp1 = run(expression.substring(index+1,index2));
            exp[1] = Integer.toString(exp1);
            if(index>0 && expression.charAt(index-1) == '-') {
                exp[0] = expression.substring(0, index-1).trim();
                exp[1] = Integer.toString(-exp1);
            }
            return run(exp[0] + exp[1] + exp[2]);
        }

        index= expression.lastIndexOf('+');
        if (index != -1){
            exp[0] = expression.substring(0,index).trim();
            exp[1] = expression.substring(index+1).trim();
            return run(exp[0]) + run(exp[1]);
        }

        index = expression.lastIndexOf('-');
        if(index != -1){
            if(index == 0) return Integer.parseInt(expression);
            exp[0] = expression.substring(0,index).trim();
            exp[1] = expression.substring(index+1).trim();
            return run(exp[0]) - run(exp[1]);
        }

        index = expression.indexOf('*');
        if(index != -1) {
            exp[0] = expression.substring(0,index).trim();
            exp[1] = expression.substring(index+1).trim();
            int exp1;
            if (!exp[1].startsWith("-")) exp1 = run(exp[1]);
            else exp1 = Integer.parseInt(exp[1]);
            return run(exp[0]) * exp1;
        }

        return Integer.parseInt(expression);
    }
}
