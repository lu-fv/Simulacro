import java.util.ArrayList;
import java.util.List;

public class Utilitary extends  Vehicule{

    private Integer maxKm;
    private Integer height;
  // public List<Utilitary> utilitaryList = new ArrayList<>();


    public Utilitary(String model, Float price, Integer maxKm, Integer height) {
        super(model, price, Types.UTILITARY);
        this.maxKm = maxKm;
        this.height = height;
        //this.utilitaryList = utilitaryList;
    }

  /*  public List<Utilitary> getUtilitaryList() {
        return utilitaryList;
    }

    public void setUtilitaryList(List<Utilitary> utilitaryList) {
        this.utilitaryList = utilitaryList;
    }*/

    public Integer getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(Integer maxKm) {
        this.maxKm = maxKm;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "maxKm=" + maxKm +
                ", height=" + height +
                "} ";
    }
}
