public class Main {
    public static void main(String[] args) {


        String[] ogrenciler = new String[3];
     ogrenciler[0] = "yakup" ;
     ogrenciler[1] = "derin" ;
     ogrenciler[2] = "ahmet" ;


     for (int i=0; i<ogrenciler.length ;i++ ){
         System.out.println(ogrenciler[i]);
     }
System.out.println("for each loop");
        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}