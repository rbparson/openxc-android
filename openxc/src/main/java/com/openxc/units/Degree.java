package com.openxc.units;

/**
 * Degree, a unit angle of measurement or in a coordinate system.
 *
 * TODO this shouldn't represent two things.
 */
public class Degree extends Quantity<Double> implements Unit {

    public Degree(double value) {
        super(value);
    }
}
