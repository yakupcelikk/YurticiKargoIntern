public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        System.out.println("-------------------");
        System.out.println("ERKEK");
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();
        System.out.println("-------------------");
        System.out.println("KADIN");
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();
        System.out.println("-------------------");
        System.out.println("ÇOCUK");
        kidsGameCalculator.hesapla();
        kidsGameCalculator.gameOver();
        System.out.println("-------------------");
    }
}