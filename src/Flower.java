public class Flower {

    private String nameFlower;
    private String country;
    private double cost;
    private int lifeSpan;

    Flower(String nameFlower, String country, double cost, int lifeSpan) {
        if (nameFlower != null && !nameFlower.isEmpty() && !nameFlower.isBlank()) {
            this.nameFlower = nameFlower;
        } else {
            this.nameFlower = "Роза";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        this.cost = Math.max(cost, 1);
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        if (nameFlower != null && !nameFlower.isEmpty() && !nameFlower.isBlank()) {
            this.nameFlower = nameFlower;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Цветок{" +
                "Наименование='" + nameFlower + '\'' +
                ", Страна='" + country + '\'' +
                ", Цена=" + cost + " руб." +
                ", срок стояния=" + lifeSpan + " дней" +
                '}';
    }
}
