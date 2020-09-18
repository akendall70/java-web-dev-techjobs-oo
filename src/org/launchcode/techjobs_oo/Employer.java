package org.launchcode.techjobs_oo;

public class Employer extends JobField{

    public Employer(String value) {
        super(value);
    }

@Override
    public String toString() {
        return this.getValue().isEmpty() ? "Data not available" : this.getValue();
}
}
