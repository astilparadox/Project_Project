/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iwannabetheverybest.inheritanceexample;

/**
 *
 * @author Astil Paradox
 */
public class InheritanceExample {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("Sphere", 0.0, 5.0);
        Cube cube = new Cube("Cube", 0.0, 4.0);

        double sphereVolume = sphere.getVolume();
        double cubeVolume = cube.getVolume();

        System.out.println("Volume of the sphere: " + sphereVolume);
        System.out.println("Volume of the cube: " + cubeVolume);
    }
}
   






