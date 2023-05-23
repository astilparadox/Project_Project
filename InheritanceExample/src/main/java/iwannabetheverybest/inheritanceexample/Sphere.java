/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iwannabetheverybest.inheritanceexample;

/**
 *
 * @author Astil Paradox
 */
class Sphere extends Shape {
    private double radius;

    public Sphere(String name, double dimension, double radius) {
        super(name, dimension);
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
