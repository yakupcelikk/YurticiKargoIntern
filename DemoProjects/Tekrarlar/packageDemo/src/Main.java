
import one.ClassOne;
import two.ClassTwo;
public class Main {
    public static void main(String[] args) {

        ClassOne.salary();
        ClassTwo.age();

        System.out.println(ClassTwo.age());
        System.out.println(ClassOne.salary());
        System.out.println("Kullanıcı "+ClassTwo.age()+" yaşında "+ClassOne.salary()+ " tl maaş alıyor.");

        ClassOne classOne = new ClassOne();

        System.out.println(classOne.getClass());




    }
    public void print(){

    }


}