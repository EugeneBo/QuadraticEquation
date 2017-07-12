import java.util.Scanner;


public class QuadraticEquations {
    public static void main(String[] args) {
//test test

        Scanner sc = new Scanner(System.in);

        System.out.println("You are going to solve quadratic equation of the type: ax+bx^2+c=0.\nPlease type your coefficients:\n");

        System.out.print("a=");
        double a = sc.nextDouble();


        System.out.print("b=");
        double b = sc.nextDouble();

        System.out.print("c=");
        double c = sc.nextDouble();


        if (a == 0) {
            if (b != 0) {

                System.out.print("\nYour equation has a linear type: " + b + "x");
                System.out.format("%+f=0", c);
                System.out.println("\nRoot: x=" + (-c / b));
            } else {
                System.out.print("No roots!");
            }

        } else {
            System.out.print("\nYour equation is: " + a + "x^2");
            System.out.format("%+fx%+f=0", b, c);

            double d = (b * b) - (4 * a * c);

            if (d >= 0) {

                if (d == 0) {
                    System.out.println("\nRoots are: x1=x2=" + (-b / (2 * a)));
                } else {
                    System.out.print("\nRoots are: x1=" + ((-b + Math.sqrt(d)) / (2 * a)));
                    System.out.print("; x2=" + ((-b - Math.sqrt(d)) / (2 * a)));
                }

            } else {
                System.out.print("\nRoots are: x1=" + (-b / (2 * a) + "+" + ((Math.sqrt(Math.abs(d))) / (2 * a)) + "i"));
                System.out.print("; x2=" + (-b / (2 * a) + "-" + ((Math.sqrt(Math.abs(d))) / (2 * a)) + "i"));
            }


        }

    }
}
