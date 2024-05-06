import java.util.ArrayList;
import java.util.List;

public class Automovile extends Vehicule {

    public  Integer airbag;
   // public List<Automovile> automovileList = new ArrayList<>();
   List <Automovile> automoviles = new ArrayList<Automovile>();
    public Automovile(String model, Float price, Integer airbag) {
        super(model, price, Types.AUTOMOVILE);
        this.airbag = airbag;
      //  this.automovileList = automovileList;
    }

    public Integer getAirbag() {
        return airbag;
    }

    public void setAirbag(Integer airbag) {
        this.airbag = airbag;
    }



    @Override
    public String toString() {
        return "{" + super.toString()+
                " INCREACE " + this.updatePrice(0.05f) +
                " airbag= " + airbag +
                "} ";


    }


}
