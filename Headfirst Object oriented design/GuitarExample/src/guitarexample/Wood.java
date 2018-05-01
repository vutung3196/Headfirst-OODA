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
public enum Wood {
    INDIA_ROSEWOOD, BRAZILLIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
    public String toString() {
        switch(this) {
            case INDIA_ROSEWOOD:
                return "India Rosewood";
            case BRAZILLIAN_ROSEWOOD:
                return "Brazillian Rosewood";
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            default:
                return null;
        }
    }
}
