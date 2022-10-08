package one;

public class ClassOne  implements testImpl {

    int id;
    String sehir ;
    String arac;
    Boolean evli;
    public static int salary() {
        int a = 5000;
        Integer salary = Integer.valueOf(a);
        return a;
    }

    public static void personalInfos() {



 /*       public personalInfos(int id, String s, String s1, boolean evli){
            this.sehir=s;
            this.arac=s1;
            this.id=id;
            this.evli=evli;

        }*/


    }


    @Override
    public void setSehir(int id, String s , String s1, boolean evli) {
        this.sehir="istanbul";
        this.arac="volvo";
        this.id=5;
        this.evli=true;
    }
}
