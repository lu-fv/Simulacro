import INTERRFACES.SportCategory;

import java.util.List;

public class Carrer extends Automovile implements SportCategory {

    private Double maxSpeed;


    public Carrer(String model, Float price, Integer airbag, Double maxSpeed) {
        super(model, price, airbag);
        this.maxSpeed = maxSpeed;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    @Override
    public String toString() {
        return "Carrer{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }

    @Override
    public String competeInRace() {
        return " Apto competicion en pista ";

    }
}
