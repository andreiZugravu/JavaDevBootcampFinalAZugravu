package org.bootcamp.calculator;

import org.bootcamp.vehicle.Vehicle;
import org.bootcamp.formula.Formula;

public final class InsurancePolicyCalculator { //asta si conversionutils pot fi facute bean-uri in loc de singleton, se ocupa spring de treaba

    public static final InsurancePolicyCalculator INSTANCE = new InsurancePolicyCalculator();

    private InsurancePolicyCalculator() {

    }

    public float calculate(Vehicle vehicle, Formula formula) {

        return formula.calculate(vehicle);
    }
}
