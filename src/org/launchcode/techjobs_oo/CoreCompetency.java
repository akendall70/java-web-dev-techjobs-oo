package org.launchcode.techjobs_oo;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return this.getValue().isEmpty() ? "Data not available" : this.getValue();
    }
}
