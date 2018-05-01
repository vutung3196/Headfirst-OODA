/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogdoorexample;

/**
 *
 * @author Tung Vu
 */
public class DogDoorSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        remote.pressButton();
        System.out.println("\nFido's all done...");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
        remote.pressButton();
    }
}
