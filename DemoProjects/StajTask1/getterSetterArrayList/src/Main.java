import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) {
        String[] Brand = {"Mercedes", "Volvo", "Ford", "BMW", "FIAT", "SEAT"};
        String[] modelYear = {"1986", "2004", "2009", "2013", "2014", "2015"};
        String[] color = {"Blue", "Red", "Black", "White", "Grey", "Green"};
        Double[] engine = {1.5,2.0,3.0,2.5,1.6,1.4};
        List<Car> infos = new ArrayList<Car>();

        //FOR LOOP
        int i;
       for (i = 0; i < Brand.length; i++) {
            Car c = new Car();
            c.setBrand(Brand[i]);
            c.setModelYear(modelYear[i]);
            c.setColor(color[i]);
            c.setEngine(engine[i]);
            infos.add(c);
        }


        for (Car c : infos) {
            System.out.println("--------------------------------");
            System.out.println(c.getFullInfo() + c.getIntInfo());

        }
        String bestBrand = "Volvo";

        switch (bestBrand){
            case "Volvo" :
                System.out.println("The best brand is "+bestBrand);
                break;
            case "Mercedes" :
                System.out.println("Not best.");
                break;
            default:
                System.out.println("Default case.");



        }



        /*
        //DO-WHILE LOOP
        System.out.println("DO WHILE LOOP");
        int i=0;
        do{
            Car c = new Car();
            c.setBrand(Brand[i]);
            c.setModelYear(modelYear[i]);
            c.setColor(color[i]);
            infos.add(c);
            System.out.println("----------------------");
            System.out.println(c.getFullInfo());
            i++;

        }while (i < Brand.length);*/



        //WHILE LOOP
/*        System.out.println("WHILE LOOP");
        int i=0;
        while (i < Brand.length) {
            Car c = new Car();
            c.setBrand(Brand[i]);
            c.setModelYear(modelYear[i]);
            c.setColor(color[i]);
            infos.add(c);
            System.out.println(c.getFullInfo());
            i++;

        }*/

    }
}