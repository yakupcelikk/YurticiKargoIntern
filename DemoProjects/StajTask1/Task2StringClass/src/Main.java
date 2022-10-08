public class Main {
    public static void main(String[] args) {

        long zaman = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("JAVA");
        for (int i = 0 ;i<100000000;i++){
            sb.append("Coding");
        }
        System.out.println("String Buffer: "+(System.currentTimeMillis()-zaman) + "ms");

        zaman = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder("JAVA");


        for (int i = 0; i<100000000; i++){
            sb2.append("Coding");
        }
        System.out.println("StringBuilder: "+(System.currentTimeMillis()-zaman)+ "ms");


        long zaman2 = System.currentTimeMillis();


        System.out.println("bu test amaçlı bir yazıdır : " + zaman2 +"ms");

    }
}