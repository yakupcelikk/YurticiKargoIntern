public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("eleman sayısı: " + mesaj.length() );
        System.out.println("5. eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("Y"));
        System.out.println(mesaj.toUpperCase());
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));

        String yeniMesaj = mesaj.replace(" ", "/");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2,4));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }


        //trim fonkisyonu ile cümlenin başındaki ve sonundaki boşlukları atabilirsin
        String mesaj3 = new String("        Hava baya iyiymiş.      ");
        System.out.println(mesaj3);
        System.out.println(mesaj3.trim());

    }
}