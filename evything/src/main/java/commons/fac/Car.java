package commons.fac;

/**
 * Created by sfeng on 2016/8/29.
 */
public class Car {
    private String brand;
    private double price;

    public Car(){

    }

    public Car(String brand,double price){
        super();
        this.brand=brand;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand="+this.brand+",price="+this.price;
    }
}
