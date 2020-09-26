import java.lang.Math;

public class ArithmeticOperatorsApplied {

    public static void main(String[] args){

        // Volume of a Cylinder
        double pi = Math.PI;
        double radius = 50.0;
        double height = 30.0;

        double volumeOfCylinder = pi * (Math.pow(radius, 2)) * height;
        System.out.println(volumeOfCylinder);

        // xˆ2+4x+4

        double a = 1;
        double b = 1;
        double c = 2;

        double discriminant = Math.pow(b, 2) - (4*a*c);
        System.out.println("The value of the discriminant is: " + discriminant);

        double x1 = (-b - Math.sqrt(discriminant)) / 2*a;
        double x2 = (-b + Math.sqrt(discriminant)) / 2*a;

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }

}
