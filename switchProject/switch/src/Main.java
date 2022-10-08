public class Main {
    public static void main(String[] args) {
        char grade = 'A';


        switch (grade) {
            case 'A':
                System.out.println("geçtiniz");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz harf notu.");
        }

        int j = 100;
        do {
            System.out.println(j);
            j-=2;
            System.out.println(j);
        }while(j<10);
        System.out.println("do-while döngüsü bitti");
    }
}