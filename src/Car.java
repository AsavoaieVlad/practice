import java.awt.*;

public class Car {

    public static void main(String[] args) {
        System.out.println("VLAD");
        Bike bike = new Bike();
        bike.getBikeBrand();
        System.out.println(bike.getBikeBrand());

    }

}

class Bike {
    private int weight;
    private String color;
    private String brand;


    public String getBikeBrand() {
        brand = "Pegas";
        return brand;
    }


}