package org.sla;

public class Main {

    public static void main(String[] args) {
        // One Step

        String symbol = args[0];
        double first = 5;
        double second = 3;
        double last = 10;

        System.out.println("x " + symbol + " " + first + " = " + last);

        switch (symbol) {
            case "+":
                System.out.println("x = " + last + " - " + first);
                System.out.println("x = " + Double.toString(last - first));
                break;
            case "-":
                System.out.println("x = " + last + " + " + first);
                System.out.println("x = " + Double.toString(last + first));
                break;
            case "/":
                System.out.println("x = " + last + " * " + first);
                System.out.println("x = " + Double.toString(last * first));
                break;
            case "*":
                System.out.println("x = " + last + " / " + first);
                System.out.println("x = " + Double.toString(last / first));
                break;
            default:
                System.out.println("Variable symbol must equal + - / or * only");
                break;
        }

        System.out.println(" ");

        // Two Step

        System.out.println(first + "x " + symbol + " " + second + " = " + last);

        switch (symbol) {
            case "+":
                System.out.println(first + "x = " + last + " - " + second);
                System.out.println(first + "x = " + Double.toString(last - second));
                System.out.println("x = " + Double.toString(last - second) + " / " + first);
                System.out.println("x = " + Double.toString((last - second) / first));
                break;
            case "-":
                System.out.println(first + "x = " + last + " + " + second);
                System.out.println(first + "x = " + Double.toString(last + second));
                System.out.println("x = " + Double.toString(last + second) + " / " + first);
                System.out.println("x = " + Double.toString((last + second) / first));
                break;
            case "/":
                System.out.println(first + "x = " + last + " * " + second);
                System.out.println(first + "x = " + Double.toString(last * second));
                System.out.println("x = " + Double.toString(last * second) + " / " + first);
                System.out.println("x = " + Double.toString((last * second) / first));
                break;
            case "*":
                System.out.println(first + "x = " + last + " / " + second);
                System.out.println(first + "x = " + Double.toString(last / second));
                System.out.println("x = " + Double.toString(last / second) + " / " + first);
                System.out.println("x = " + Double.toString((last / second) / first));
                break;
            default:
                System.out.println("Variable symbol must equal + - / or * only");
                break;
        }

        System.out.println(" ");

        // Squared

        System.out.println(first + "x^2 " + symbol + " " + second + " = " + last);

        switch (symbol) {
            case "+":
                System.out.println(first + "x^2 = " + last + " - " + second);
                System.out.println(first + "x^2 = " + Double.toString(last - second));
                System.out.println("x^2 = " + Double.toString(last - second) + " / " + first);
                System.out.println("x^2 = " + Double.toString((last - second) / first));

                System.out.println("x = ± sqrt(" + Double.toString((last - second) / first) + ")");
                System.out.println("x = " + Double.toString(Math.sqrt((last - second) / first)));
                System.out.println("and");
                System.out.println("x = " + Double.toString((Math.sqrt((last - second) / first)) * -1));
                break;
            case "-":
                System.out.println(first + "x^2 = " + last + " + " + second);
                System.out.println(first + "x^2 = " + Double.toString(last + second));
                System.out.println("x^2 = " + Double.toString(last + second) + " / " + first);
                System.out.println("x^2 = " + Double.toString((last + second) / first));

                System.out.println("x = ± sqrt(" + Double.toString((last + second) / first) + ")");
                System.out.println("x = " + Double.toString(Math.sqrt((last + second) / first)));
                System.out.println("and");
                System.out.println("x = " + Double.toString((Math.sqrt((last + second) / first)) * -1));
                break;
            case "/":
                System.out.println(first + "x^2 = " + last + " * " + second);
                System.out.println(first + "x^2 = " + Double.toString(last * second));
                System.out.println("x^2 = " + Double.toString(last * second) + " / " + first);
                System.out.println("x^2 = " + Double.toString((last * second) / first));

                System.out.println("x = ± sqrt(" + Double.toString((last * second) / first) + ")");
                System.out.println("x = " + Double.toString(Math.sqrt((last * second) / first)));
                System.out.println("and");
                System.out.println("x = " + Double.toString((Math.sqrt((last * second) / first)) * -1));
                break;
            case "*":
                System.out.println(first + "x^2 = " + last + " / " + second);
                System.out.println(first + "x^2 = " + Double.toString(last / second));
                System.out.println("x^2 = " + Double.toString(last / second) + " / " + first);
                System.out.println("x^2 = " + Double.toString((last / second) / first));

                System.out.println("x = ± sqrt(" + Double.toString((last / second) / first) + ")");
                System.out.println("x = " + Double.toString(Math.sqrt((last / second) / first)));
                System.out.println("and");
                System.out.println("x = " + Double.toString((Math.sqrt((last / second) / first)) * -1));
                break;
            default:
                System.out.println("Variable symbol must equal + - / or * only");
                break;
        }
    }
}
