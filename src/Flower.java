public class Flower {


    private String flowerColor;    //цвет
    private String country;   // страна
    private double cost;    // стоимость
    int lifeSpan;  // срок стояния

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = " Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = " Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = " Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = " Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }


    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
