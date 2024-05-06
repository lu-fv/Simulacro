import INTERRFACES.SportCategory;

import java.util.ArrayList;
import java.util.List;

public class Motocycle extends  Vehicule implements SportCategory {
    private Integer cylinder;

    List <Motocycle> motocycles = new ArrayList<Motocycle>();
    public Motocycle(String model, Float price, Integer cylinder) {
        super(model, price, Types.MOTOCYCLE);
        this.cylinder = cylinder;

    }


    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "{" + super.toString()+
                " INCREACE " + this.updatePrice(0.05f) +
                this.competeInRace() +
                "cylinder=" + cylinder +
                "} ";
    }

    @Override
    public String competeInRace() {
       return   " Apto competicion en pista ";
    }
}
