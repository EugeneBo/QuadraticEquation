import java.util.Scanner;


public class QuadraticEquations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("You are going to solve quadratic equation of the type: ax+bx^2+c=0.\nPlease type your coefficients:\n");

        System.out.print("a=");
        double a = sc.nextDouble();

        System.out.print("b=");
        double b = sc.nextDouble();

        System.out.print("c=");
        double c = sc.nextDouble();

//        if (a == 0) {
//            if (b != 0) {
//
//                System.out.format("\nYour equation has a linear type: %fx%+f=0", b, c);
//                System.out.println("\nRoot: x=" + (-c / b));
//            } else {
//                System.out.print("No roots!");
//            }
//
//        } else {

            System.out.format("\nYour equation is: %fx^2%+fx%+f=0", a, b, c);

            double d = (b * b) - (4 * a * c);
            double root1 = -b / (2 * a);
            double root2 = (Math.sqrt(Math.abs(d))) / (2 * a);

            if (d >= 0) {

                if (d == 0) {

                    System.out.println("\nRoots are: x1=x2=" + root1);
                } else {
                    System.out.print("\nRoots are: x1=" + (root1 + root2) + "; x2=" + (root1 - root2));
                }

            } else {

                System.out.format("\nRoots are: x1=" + root1 + "+" + Math.abs(root2)+"*i" + "; x2=" + root1 + "-" + Math.abs(root2)+"*i");
            }


       // }

    }
}
