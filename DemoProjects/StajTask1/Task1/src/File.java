import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {

            public  void fileWriter() {
            java.io.File file2 = new java.io.File("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt");
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt"));

            } catch (IOException e) {
                e.printStackTrace();
            }
          //  fileWriter();

        }


    public  void fileReader() {
        java.io.File file = new java.io.File("/Users/yakupcelik/IdeaProjects/DemoProjects/StajTask1/Task1/car.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


     //  fileReader();

    }




}
