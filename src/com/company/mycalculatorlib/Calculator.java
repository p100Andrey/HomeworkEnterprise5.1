package com.company.mycalculatorlib;

public class Calculator implements Addable, Subtractable {

    @Override
    public String calculate(String str) {
        char operator = str.charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/'){
            System.out.println("Формат ввода данных неверный!");
            return null;
        }
        if (str.charAt(1) != ','){
            System.out.println("Формат ввода данных неверный!");
            return null;
        }
        String x = new String("");
        String y = new String("");
        int i = 2;
        while (i < str.length() && str.charAt(i) != ',') {
            x = x + str.charAt(i);
            i++;
        }
        i++;
        while (i < str.length()) {
            y = y + str.charAt(i);
            i++;
        }

        switch (operator) {
            case '+':
                try {
                    System.out.println(x + operator + y + '=' + add(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe){
                    System.out.println("Формат ввода данных неверный!");
                }
                break;
            case '-':
                try {
                    System.out.println(x + operator + y + '=' + subtract(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe) {
                    System.out.println("Формат ввода данных неверный!");
                }
                break;
        }
        return null;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }
}
