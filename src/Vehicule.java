public abstract class Vehicule {

    public String model;
    public Float price;
    public Float priceIncreace;
    public Types type;

    public Vehicule(String model, Float price, Types type) {
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public float updatePrice(float percent) {
        float increace = this.price * (percent / 100);
        return this.price += increace;
    }

    /*public void updatePrice(float percent) {
        float increace = this.price * (percent / 100);
        this.priceIncreace = this.price + increace;
    }*/



    @Override
    public String toString() {
        return "Vehicule{" +
                ", type=" + type + '\'' +
                ", price=" + price +
                " model='" + model +
                '}';
    }
}
