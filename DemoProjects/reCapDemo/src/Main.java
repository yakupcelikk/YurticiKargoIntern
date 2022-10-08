public class Main {
    public static void main(String[] args) {
       DortIslem dortIslem = new DortIslem();
       dortIslem.Cikarma(35,12);
       dortIslem.Topla(13,43);
       dortIslem.Carpma(47,21);
       dortIslem.Bolme(12,2);

       int sonuc= dortIslem.Cikarma(35,12);

       System.out.println(sonuc);
    }
}