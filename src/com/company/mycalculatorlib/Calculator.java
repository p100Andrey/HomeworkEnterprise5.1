package com.company.mycalculatorlib;

public class Calculator {

    public String calculate(String str) {
        char operator = 0;
        int operatorIndex = 0;
        if (str.contains("+")) {
            operator = '+';
            operatorIndex = str.indexOf('+');
        } else if (str.contains("-")) {
            operator = '-';
            operatorIndex = str.indexOf('-');
        } else if (str.contains("*")) {
            operator = '*';
            operatorIndex = str.indexOf('*');
        } else if (str.contains("/")) {
            operator = '/';
            operatorIndex = str.indexOf('/');
        } else if (str.contains("^")) {
            operator = '^';
            operatorIndex = str.indexOf('^');
        } else {
            System.out.println("Формат ввода данных неверный!");
            return null;
        }

        String x = new String("");
        String y = new String("");

        int index = 0;
        if (index == operatorIndex) { // оператор в начале
            index++;
            while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                index++;
            }
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                for (int i = index; i < 28 + index; i++) {
                    x += str.charAt(i);
                }
                index += 28;
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    y += str.charAt(index++);
                }
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    x += str.charAt(index++);
                }
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                for (int i = index; i < str.length(); i++) {
                    y += str.charAt(i);
                }
            }
        } else if (str.length() - 1 == operatorIndex) { // оператор в конце
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                for (int i = index; i < 28 + index; i++) {
                    x += str.charAt(i);
                }
                index += 28;
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    y += str.charAt(index++);
                }
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    x += str.charAt(index++);
                }
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                    for (int i = index; i < 28 + index; i++) {
                        y += str.charAt(i);
                    }
                } else {
                    while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                            str.charAt(index) == '.') {
                        y += str.charAt(index++);
                    }
                }
            }
        } else { // оператор в средине
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                for (int i = index; i < 28 + index; i++) {
                    x += str.charAt(i);
                }
                index += 28;
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                index++;
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    y += str.charAt(index++);
                }
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                while (str.charAt(index) >= '0' && str.charAt(index) <= '9' ||
                        str.charAt(index) == '.') {
                    x += str.charAt(index++);
                }
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                index++;
                while (str.charAt(index) == ' ' || str.charAt(index) == ',') {
                    index++;
                }
                for (int i = index; i < str.length(); i++) {
                    y += str.charAt(i);
                }
            }
        }

        switch (operator) {
            case '+':
                try {
                    System.out.println(x + operator + y + '=' + add(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe) {
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
            case '*':
                try {
                    System.out.println(x + operator + y + '=' + multiply(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe) {
                    System.out.println("Формат ввода данных неверный!");
                }
                break;
            case '/':
                try {
                    System.out.println(x + operator + y + '=' + divide(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe) {
                    System.out.println("Формат ввода данных неверный!");
                }
                break;
            case '^':
                try {
                    System.out.println(x + operator + y + '=' + power(Double.parseDouble(x), Double.parseDouble(y)));
                } catch (NumberFormatException nfe) {
                    System.out.println("Формат ввода данных неверный!");
                }
                break;
        }
        return null;
    }

    public double multiply(double x, double y) {
        return 0;
    }

    public double divide(double x, double y) {
        return 0;
    }

    public double power(double x, double y) {
        return 0;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double add(double x, double y) {
        return x + y;
    }
}
