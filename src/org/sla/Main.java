package org.sla;

public class Main {

    public static void main(String[] args) {
        // One Step

        char symbol = '*';
        double first = 5;
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

        // Two Step
    }
}
