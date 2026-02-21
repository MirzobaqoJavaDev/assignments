package javaKurs;

import java.util.Scanner;

public class Consol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Mirzokarimov Mirzobaqo %n%70s%n%n","mirzokarimovmirzobaqo@gmail.com");

        System.out.print("Please enter name: ");
        String name = input.next();
        System.out.printf("hello %s welcome%n%n", name);


        double width;
        double height;
        double radius;

        System.out.print("Please enter width: ");
        width = input.nextDouble();
        System.out.print("Please enter height: ");
        height = input.nextDouble();

        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.printf("square are %.2f%n",area);
        System.out.printf("square perimeter %.2f%n", perimeter);

        System.out.print("Please enter radius: ");
        radius = input.nextDouble();
        double length = 2*Math.PI*radius;
        double areaCircle = Math.pow(radius,2)*Math.PI;

        double volume = areaCircle*length;
        System.out.printf("Circle area %.2f%n", areaCircle);
        System.out.printf("Ball volume %.2f%n", volume);

        System.out.println("--------------------");

        double side;
        double length1 ;
        System.out.print("Enter length of the sides of the Equilateral triangle: ");
        side =input.nextDouble();
        System.out.println("Enter length of the height of the Equilateral triangle: ");
        length1 =input.nextDouble();

        area = Math.pow(3,0.5)*1/4*side*side;
        volume = area*length1;
        System.out.printf("The area is %.2f%n",area);
        System.out.printf("The volume of the Triangular prism is %s%n", volume);



    }
}
