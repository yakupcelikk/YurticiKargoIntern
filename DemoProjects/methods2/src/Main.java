public class Main {
    public static void main(String[] args) {
        ekle();
        sil();
        guncelle();

        String mesaj = "Bugün hava çok güzel ";
        String yeniMesaj = sehir();
        System.out.println(yeniMesaj);
        int sayi = topla(9, 11);
        System.out.println(sayi);
        int toplam = topla2( 3,4,5,6,7,8,9);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("guncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehir() {
        return "İstanbul";

    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi: sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}