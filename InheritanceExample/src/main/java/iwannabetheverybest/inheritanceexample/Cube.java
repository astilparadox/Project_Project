/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iwannabetheverybest.inheritanceexample;

/**
 *
 * @author Astil Paradox
 */
class Cube extends Shape {
    private double sideLength;

    public Cube(String name, double dimension, double sideLength) {
        super(name, dimension);
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
