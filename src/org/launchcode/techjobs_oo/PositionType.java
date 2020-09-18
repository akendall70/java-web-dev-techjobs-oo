package org.launchcode.techjobs_oo;

public class PositionType extends JobField{

    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return this.getValue().isEmpty() ? "Data not available" : this.getValue();
    }
}
