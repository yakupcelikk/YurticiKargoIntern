import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {


        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //Adding brands to carBrand Arraylist
       // map.put()
        ArrayList<String> carBrand = new ArrayList<>();
        carBrand.add("Mercedes");
        carBrand.add("Volvo");
        carBrand.add("Ford");
        carBrand.add("Bmw");
        carBrand.add("Mercedes");
        carBrand.add("Seat");
        //
        ArrayList<String> carModelMercedes = new ArrayList<>();
        carModelMercedes.add("E250");
        carModelMercedes.add("C180");


        ArrayList<String> carModelMix = new ArrayList<>();
        carModelMix.add("S90");
        carModelMix.add("Focus");
        carModelMix.add("520d");
        carModelMix.add("Leon");

        map.put("mercedes",carModelMercedes);

        for (String key: map.keySet()) {
            System.out.println(key + " : ");
            for (String item :map.get(key)) {
                System.out.println(item);


            }
            System.out.println("");

        }
        System.out.println(map);


//        map.put("E250","Mercedes");
//        map.put("S90","Volvo");
//        map.put("Focus","Ford");
//        map.put("520d","Bmw");
//        map.put("C180","Mercedes");
//        map.put("Leon","SEAT");




            

        }

       // System.out.println(map);





        //FOR LOOP
//        int i;
//        for (i = 0; i < Brand.length; i++) {
//            Car c = new Car();
//            c.setBrand(Brand[i]);
//            c.setModelYear(modelYear[i]);
//            c.setColor(color[i]);
//            c.setEngine(engine[i]);
//            infos.add(c);
//        }
//
//
//        for (Car c : infos) {
//            System.out.println("--------------------------------");
//            System.out.println(c.getFullInfo() + c.getIntInfo());
//
//        }
//        String bestBrand = "Volvo";
//
//        switch (bestBrand) {
//            case "Volvo":
//                System.out.println("The best brand is " + bestBrand);
//                break;
//            case "Mercedes":
//                System.out.println("Not best.");
//                break;
//            default:
//                System.out.println("Default case.");
//
//
//        }
//
//
//        //DO-WHILE LOOP
//        System.out.println("DO WHILE LOOP");
//        int i = 0;
//        do {
//            Car c = new Car();
//            c.setBrand(Brand[i]);
//            c.setModelYear(modelYear[i]);
//            c.setColor(color[i]);
//            infos.add(c);
//            System.out.println("----------------------");
//            System.out.println(c.getFullInfo());
//            i++;
//
//        } while (i < Brand.length);
//
//
//        //WHILE LOOP
//        System.out.println("WHILE LOOP");
//        int i = 0;
//        while (i < Brand.length) {
//            Car c = new Car();
//            c.setBrand(Brand[i]);
//            c.setModelYear(modelYear[i]);
//            c.setColor(color[i]);
//            infos.add(c);
//            System.out.println(c.getFullInfo());
//            i++;
//
//        }

    }

