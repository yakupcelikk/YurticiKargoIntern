public class Main {
    public static void main(String[] args) {


        try {
            int [] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("Hata Oluştu String.");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata Oluştu Array.");
        }catch (Exception exception){
            System.out.println("loglandı: " +exception);
        }
        finally {
            System.out.println("Ben her türlü calışırım.");
        }


    }
}