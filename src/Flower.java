public class Flower {

    private String flowerColor;
    private String country;
    double cost;
    int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
    this.flowerColor = flowerColor;
    this.country = country;
    this.cost = cost;
    this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }


}
