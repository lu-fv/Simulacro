import java.util.List;

public class Urbans extends Automovile  {

    private Integer numberPassanger;

    public Urbans(String model, Float price, Integer airbag, Integer numberPassanger) {
        super(model, price, airbag);
        this.numberPassanger = numberPassanger;
    }

    public Integer getNumberPassanger() {
        return numberPassanger;
    }

    public void setNumberPassanger(Integer numberPassanger) {
        this.numberPassanger = numberPassanger;
    }

    @Override
    public String toString() {
        return "Urbans{" +
                "numberPassanger=" + numberPassanger +
                "} " + super.toString();
    }

}
