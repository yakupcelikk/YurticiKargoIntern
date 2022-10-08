public class Main {
    public static void main(String[] args) {

        int number = 4;
       // int remainder = number % 2;

        boolean isPrime = true;
        if (number==1){
            System.out.println("Sayı Asal değildir.");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }


        for (int i=2;i<number;i++  ){
            if(number % 2 == 0){
                isPrime = false;
            }


            if(isPrime){
                System.out.println("Asal sayıdır.");
            }else{
                System.out.println("Asal sayı değil.");
            }


        }
       // System.out.println(isPrime);
    }
}