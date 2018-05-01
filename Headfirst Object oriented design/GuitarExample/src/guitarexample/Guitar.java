/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarexample;

/**
 *
 * @author Tung Vu
 */
public class Guitar {
    private String serialNumber;   
   
    private GuitarSpec guitarSpec;

    private double price;
    
    public Guitar(String serialNumber, double price, 
                  GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice( float newPrice) {
        this.price = newPrice;
    }
    
    public GuitarSpec getSpec() {
        return guitarSpec;
    }
}
