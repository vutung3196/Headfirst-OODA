/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tung Vu
 */
public class Inventory {
    private List guitars;
    
    public Inventory() {
        guitars = new LinkedList();
    }
    
    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add((guitar));
    }
    
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }   
}
