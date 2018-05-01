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
public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;
    public String toString() {
        switch(this) {
            case FENDER: 
                return "Fender";
            case MARTIN:
                return "Martin";
            case GIBSON:
                return "Gibson";
            case COLLINGS:
                return "Collings";
            case OLSON:
                return "Olson";
            case RYAN:
                return "Ryan";
            case PRS:
                return "Prs";
            case ANY:
                return "Any";
            default:
                return null;
        }
    }
}
