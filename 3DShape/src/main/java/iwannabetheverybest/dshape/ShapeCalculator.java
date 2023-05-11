/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.dshape;

import java.util.Scanner;

/**
 *
 * @author Astil Paradox
 */

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape;
        shape = null;
        while (true) {
            System.out.println("To create a new shape, press 1");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Select a shape:");
                    System.out.println("1. Sphere");
                    System.out.println("2. Cube");
                    System.out.println("3. Cylinder");
                    System.out.println("4. Cone");
                    int shapeOption = scanner.nextInt();

                    switch (shapeOption) {
                        case 1 -> {
                            System.out.print("Enter the radius of the sphere: ");
                            double sphereRadius = scanner.nextDouble();
                            shape = new Sphere(sphereRadius);
                             double volume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
                             System.out.println("Volume of the sphere: " + volume + " Cubic Meter");
                             double surfaceArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
                             System.out.println("Surface area of the sphere: " + surfaceArea + " Square Meter");
                             break;
                    }
                        case 2 -> {
                            System.out.print("Enter the side length of the cube: ");
                            double cubeSideLength = scanner.nextDouble();
                            shape = new Cube(cubeSideLength);
                            double volume = Math.pow(cubeSideLength, 3);
                            System.out.println("Volume of the cube: " + volume + " Cubic Meter");
                            double surfaceArea = 6 * Math.pow(cubeSideLength, 2);
                            System.out.println("Surface area of the cube: " + surfaceArea + " Square Meter");
                            break;
                    }
                        case 3 -> {
                            System.out.print("Enter the radius of the cylinder: ");
                            double cylinderRadius = scanner.nextDouble();
                            System.out.print("Enter the height of the cylinder: ");
                            double cylinderHeight = scanner.nextDouble();
                            shape = new Cylinder(cylinderRadius, cylinderHeight);
                            double volume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
                            System.out.println("Volume of the cylinder: " + volume +" Cubic Meter");
                            double surfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * Math.pow(cylinderRadius, 2));
                            System.out.println("Surface area of the cylinder: " + surfaceArea + " Square Meter");
                            break;
                    }
                        case 4 -> {
                            System.out.print("Enter the radius of the cone: ");
                            double coneRadius = scanner.nextDouble();
                            System.out.print("Enter the height of the cone: ");
                            double coneHeight = scanner.nextDouble();
                            shape = new Cone(coneRadius, coneHeight);
                            double volume = (1.0 / 3.0) * Math.PI * Math.pow(coneRadius, 2) * coneHeight;
                            System.out.println("Volume of the cone: " + volume + " Cubic Meter");
                            double slantHeight = Math.sqrt(Math.pow(coneRadius, 2) + Math.pow(coneHeight, 2));
                            double surfaceArea = Math.PI * coneRadius * (coneRadius + slantHeight);
                            System.out.println("Surface area of the cone: " + surfaceArea + " Square Meter");
                            break;
                    }
                    }
                }
            }
        }
    }
}
    

       