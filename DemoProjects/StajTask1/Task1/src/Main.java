import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // String[] Brand = {"Mercedes", "Volvo", "Ford", "BMW", "FIAT", "SEAT"};
        // String[] modelYear = {"1986", "2004", "2009", "2013", "2014", "2015"};
        //  String[] color = {"Blue", "Red", "Black", "White", "Grey", "Green"};
        //  Double[] engine = {1.5, 2.0, 3.0, 2.5, 1.6, 1.4};
        //   Double[] price = {2000.0, 2500.0, 3000.0, 3500.0, 1750.0, 1250.0};
        List<Car> infos = new ArrayList<Car>();
        infos.add(new Car("mercedes", "1986", "Blue", 1.5, 2000.0));
        infos.add(new Car("Volvo", "2004", "Red", 2.0, 2500.0));
        infos.add(new Car("Ford", "2009", "Black", 3.0, 3000.0));
        infos.add(new Car("Bmw", "2013", "White", 2.5, 3500.0));
        infos.add(new Car("Fiat", "2014", "Grey", 1.6, 1750.0));
        infos.add(new Car("Seat", "20015", "Green", 1.4, 1250.0));

//        File file = new File("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt");
//        try {
//            if (file.createNewFile()){
//                System.out.println("Dosya oluşturuldu");
//
//        } else {
//                System.out.println("Dosya zaten mevcut");
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }


        //FOR LOOP

//        // TRY-CATCH-EXAMPLE must be i++
//        try{
//            int i;
//            for (i = 0; i < Brand.length; i--) {
//                Car c = new Car();
//                c.setBrand(Brand[i]);
//                c.setModelYear(modelYear[i]);
//                c.setColor(color[i]);
//                c.setEngine(engine[i]);
//                infos.add(c);
//            }
//
//        }catch (Exception exception){
//            System.out.println("Hata Oluştu" +"\n"+exception);
//
//        }
//            int i;
//            for (i = 0; i < Brand.length; i++) {
//                Car c = new Car();
//                c.setBrand(Brand[i]);
//                c.setModelYear(modelYear[i]);
//                c.setColor(color[i]);
//                c.setEngine(engine[i]);
//                c.setPrice(price[i]);
//                infos.add(c);
//
//
//      }
        for (Car c : infos) {
            System.out.println("--------------------------------");
            // System.out.println("araç bilgileri yazdırılıyor. ");
            System.out.println(c.getBrand() + " | " + c.getModelYear() + " | " + c.getColor() + " | " + c.getPrice());

        }

        String bestBrand = "Volvo";
        switch (bestBrand) {
            case "Volvo":
                System.out.println("The best brand is " + bestBrand);
                break;
            case "Mercedes":
                System.out.println("Not best.");
                break;
            default:
                System.out.println("Default case.");


        }
        char choice;    // To store the user's choice

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Ask the user to enter y or n.
        System.out.print("Will you buy a car? Enter Y or N: ");

        choice = console.next().toLowerCase().charAt(0);


        // Determine which character the user entered.
        switch (choice) {
            case 'y':
                System.out.println("You entered Y. You can choose your car.");
                break;
            case 'n':
                System.out.println("You entered N. Thanks for everything.");
                break;
            default:
                System.out.println("Incorrect Input!");
        }


        System.out.print("Which car do you want?  ");
        Scanner console2 = new Scanner(System.in);

        String buyingCarName;
        buyingCarName = console2.nextLine().toUpperCase();

        for (Car check : infos){
            try{
                if (!check.getBrand().equals(buyingCarName))
                    throw new InsufficientStock("STOKLARDA OLMAYAN BİR ARAÇ GİRDİNİZ.");

            }catch (InsufficientStock insufficientStock){
                System.out.println(insufficientStock);
            }
            break;

        }



        switch (buyingCarName.toLowerCase()) {
            //  case "Volvo":
            case "volvo":
                System.out.println("Volvo aracı seçildi.");
                System.out.println();
                break;

            //  case "Mercedes":
            case "mercedes":
                System.out.println("Mercedes aracı seçildi.");
                break;

            // case "Ford":
            case "ford":
                System.out.println("Ford aracı seçildi.");
                break;

            //case "BMW":
            case "bmw":
                System.out.println("BMW aracı seçildi.");
                break;

            //case "FIAT":
            case "fiat":
                System.out.println("Fiat aracı seçildi.");
                break;

            //case "SEAT":
            case "seat":
                System.out.println("Seat aracı seçildi.");
                break;
            default:
                System.out.println("There is no car which do you search.");
//
//                    do {
//                        int a = 3;
//                        for (a =3; a<6 ; a++) {
//                            System.out.print("Which car do you want?  ");
//                            Scanner console4 = new Scanner(System.in);
//                            buyingCarName = console4.nextLine().toUpperCase();
//
//                        }
//
//                    }while (buyingCarName.equals(console2));
                break;


        }
        // money calculation
        System.out.print("How much money do you have?   ");
        Scanner console3 = new Scanner(System.in);
        Double balanceCalculation;

        balanceCalculation = console3.nextDouble();
        for (Car car : infos) {
            System.out.println("for döngüsüne girildi");
            if (balanceCalculation <= car.getPrice()) {
                System.out.println("ilk if döngüsüne girildi");
                throw new BalanceException("BAKİYE YETERSİZ");



            } else if(car.getBrand().equals(buyingCarName)) {
                    System.out.println("2. if döngüsüne girildi.");

                    System.out.println("Satın almak istediğiniz aracın fiyatı: " + "\n" + car.getPrice());

                    System.out.println("Satın alım sonrası kalan paranız: ");
                    System.out.println(balanceCalculation - car.getPrice());
                    break;
            }

        }

//DOSYA OKUMA VE YAZMA KODLARINI ÇALIŞTIRIYOR
  //      fileWriter();
  //      fileReader();


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


    // DOSYAYA YAZMA KODU
//    public static void fileWriter() {
//        java.io.File file2 = new java.io.File("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt");
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt"));
//            writer.newLine();
//            writer.write("mercedes,1986,Blue,1.5,2000.0");
//            writer.newLine();
//            writer.write("Volvo,2004,Red,2.0,2500.0");
//            writer.newLine();
//            writer.write("Ford,2009,Black,3.0,3000.0");
//            writer.newLine();
//            writer.write("Bmw,2013,White,2.5,3500.0");
//            writer.newLine();
//            writer.write("Fiat,2014,Grey,1.6,1750.0");
//            writer.newLine();
//            writer.write("Seat,2015,Green,1.4,1250.0");
//            writer.newLine();
//            System.out.println("Dosya üzerine yazıldı. ");
//
//            writer.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    //DOSYADAN OKUMA KODU
//    public static void fileReader() {
//        java.io.File file = new java.io.File("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt");
//        try {
//            Scanner reader = new Scanner(file);
//            while (reader.hasNext()) {
//                String[] words = reader.nextLine().split(",");
//
//                for (String a : words) {
//
//
//                    System.out.println(a);
//                    for (int j = 0; j < 1; j++) {
//                        System.out.println("---------");
//
//                    }
//
//                }
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//    }


}


