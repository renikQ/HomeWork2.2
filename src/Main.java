public class Main {

    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.50, 10);
        System.out.println(pion);
        Bouquet firstBouquet = new Bouquet(new Flower[]{rose, chrysanthemum, pion, gypsophila});
        System.out.printf("Букет будет стоить %.2f простоит %s дней.", firstBouquet.getCost(), firstBouquet.getLifeSpan());



    }
}