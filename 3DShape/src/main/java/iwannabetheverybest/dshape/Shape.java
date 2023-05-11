/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iwannabetheverybest.dshape;


abstract class Shape {
    abstract double getVolume();
    abstract double getSurfaceArea();
}

class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape {
    private double sideLength;

    Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }
}
