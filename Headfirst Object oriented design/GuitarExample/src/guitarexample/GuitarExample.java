/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarexample;

import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Tung Vu
 */
public class GuitarExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        InitializedInventory(inventory);
        
        GuitarSpec whatErinlikes = new GuitarSpec(Builder.FENDER, "Stratocastor", 
                                          Type.ELECTRIC, 2, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinlikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println(" We have a " + 
                    spec.getBuilder() + " " + spec.getModel() + " " +
                    spec.getType() + " guitar:\n   " + 
                    spec.getBackWood() + " back and sides,\n  " +
                    spec.getTopWood() + " top.\n You can have it for only $" +
                    guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
            
            // Bad design
        }
    }
    
    private static void InitializedInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 2, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95693", 1499.95, Builder.COLLINGS, "Stratocastor", Type.ACOUSTIC, 1, Wood.BRAZILLIAN_ROSEWOOD, Wood.CEDAR);
        inventory.addGuitar("V95693", 1499.95, Builder.GIBSON, "Stratocastor", Type.ACOUSTIC, 3,  Wood.INDIA_ROSEWOOD, Wood.ALDER);
        inventory.addGuitar("V95694", 1599.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 4, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95696", 1499.95, Builder.MARTIN, "Stratocastor", Type.ELECTRIC, 5, Wood.MAPLE, Wood.COCOBOLO);
    }   
}
