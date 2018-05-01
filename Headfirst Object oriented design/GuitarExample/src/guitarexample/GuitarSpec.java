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
public class GuitarSpec {
    private int numStrings;
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public int getNumStrings() {
        return numStrings;
    }
    
    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
    
    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder) {
            return false;
        }
        if ((model != null) && (!model.equals("")) &&
            (!model.equals(otherSpec.model))) {
            return false;
        }
        if (type != otherSpec.type) {
            return false;
        }
        if (numStrings != otherSpec.numStrings) {
            return false;
        }
        if (topWood != otherSpec.topWood) {
            return false;
        }
        if (backWood != otherSpec.backWood) {
            return false;
        }
        return true;
    }
}
