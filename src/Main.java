public class Main {
    public static void main(String[] args) {

        Flower rosa = new Flower(null, " Голландия", 35.59, -1);
        Flower chrysanthemum = new Flower(null, null, 15.00, 5);
        Flower pion = new Flower(null, " Англия", 69.90, 1);
        Flower gipsofila = new Flower(null, "Турция ", 19.50, 10);
        printInfo(rosa);
        printInfo(chrysanthemum);
        printInfo(pion);
        printInfo(gipsofila);
        System.out.println();


        printTheCostOfTheBouquet(rosa, rosa, rosa, chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum, gipsofila);

    }

    private static void printInfo(Flower flower) {
        System.out.println(" Цвет" + flower.getFlowerColor() + " , Страна происхождения " + flower.getCountry() + " , стоимость "
                + flower.getCost() + " , срок стояния " + flower.lifeSpan);
    }

    private static void printTheCostOfTheBouquet(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println(" Стоимость букета " + totalCost);
        System.out.println(" Срок стояния букета" + minimumLifeSpan);


    }

}
