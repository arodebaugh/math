package org.sla;

public class Main {

    public static void main(String[] args) {
        // One Step

        char symbol = '/';
        double first = 5;
        double second = 3;
        double last = 10;

        System.out.println("x " + symbol + " " + first + " = " + last);

        if (symbol == '+') {
            System.out.println("x = " + last + " - " + first);
            System.out.println("x = " + Double.toString(last - first));
        } else if (symbol == '-') {
            System.out.println("x = " + last + " + " + first);
            System.out.println("x = " + Double.toString(last + first));
        } else if (symbol == '/') {
            System.out.println("x = " + last + " * " + first);
            System.out.println("x = " + Double.toString(last * first));
        } else if (symbol == '*') {
            System.out.println("x = " + last + " / " + first);
            System.out.println("x = " + Double.toString(last / first));
        } else {
            System.out.println("Variable symbol must equal + - / or * only");
        }

        System.out.println(" ");

        // Two Step

        System.out.println(first + "x " + symbol + " " + second + " = " + last);

        if (symbol == '+') {
            System.out.println(first + "x = " + last + " - " + second);
            System.out.println(first + "x = " + Double.toString(last - second));
            System.out.println("x = " + Double.toString(last - second) + " / " + first);
            System.out.println("x = " + Double.toString((last - second) / first));
        } else if (symbol == '-') {
            System.out.println(first + "x = " + last + " + " + second);
            System.out.println(first + "x = " + Double.toString(last + second));
            System.out.println("x = " + Double.toString(last + second) + " / " + first);
            System.out.println("x = " + Double.toString((last + second) / first));
        } else if (symbol == '/') {
            System.out.println(first + "x = " + last + " * " + second);
            System.out.println(first + "x = " + Double.toString(last * second));
            System.out.println("x = " + Double.toString(last * second) + " / " + first);
            System.out.println("x = " + Double.toString((last * second) / first));
        } else if (symbol == '*') {
            System.out.println(first + "x = " + last + " / " + second);
            System.out.println(first + "x = " + Double.toString(last / second));
            System.out.println("x = " + Double.toString(last / second) + " / " + first);
            System.out.println("x = " + Double.toString((last / second) / first));
        } else {
            System.out.println("Variable symbol must equal + - / or * only");
        }
    }
}
