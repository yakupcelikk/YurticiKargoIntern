public class Main {
    public static void main(String[] args) {

    sayiBulmaca();

    }

    public  static void sayiBulmaca(){

        int[] sayi = new int[]{1,2,3,4,5,7,8};
        int aranacak = 1;
        boolean varMi = false;

        for (int i: sayi) {
            if (i == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı array de bulundu.");
        }else {
            System.out.println("Sayı array de bulunamadı.");
        }

    }
}