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
public enum Type {
    ACOUSTIC, ELECTRIC;
    public String toString() {
        switch(this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELECTRIC:
                return "Electric";
            default:
                return null;
        }
    }
}
