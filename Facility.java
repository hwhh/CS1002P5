/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Facility {
    private String restroom, cafe, carPark, shop;
    private Museum museum;

    public Facility(Museum museum) {
        this.museum = museum;
    }

    public Facility(String cafe, String restroom, String carPark, String shop) {
        this.cafe = cafe;
        this.restroom = restroom;
        this.carPark = carPark;
        this.shop = shop;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public String getRestroom() {
        return restroom;
    }

    public String getShop() {
        return shop;
    }

    public Museum getMuseum() {
        return museum;
    }

    public String getCarPark() {
        return carPark;
    }

    public String getCafe() {
        return cafe;
    }
}
