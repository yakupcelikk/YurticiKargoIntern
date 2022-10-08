public class Main {
    public static void main(String[] args) {
       StringBuffer stringBuffer = new StringBuffer("çelik ");
       stringBuffer.append("yakup");
       System.out.println(stringBuffer);


       StringBuilder sb = new StringBuilder("yakup ");
       System.out.println(sb.delete(0,2));

        StringBuilder sb1 = new StringBuilder("yakup ");
        System.out.println(sb1.insert(2,"YOO"));

        StringBuilder sb2 = new StringBuilder("yakup ");
        System.out.println(sb2.reverse());

        StringBuilder sb3 = new StringBuilder("yakup ");
        System.out.println(sb3.reverse().delete(0,3).insert(2,"****").reverse());






    }
}