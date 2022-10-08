import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList<>();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add("istanbul");


        for (Object i:sayilar) {
            System.out.println(i);

        }


    }
}