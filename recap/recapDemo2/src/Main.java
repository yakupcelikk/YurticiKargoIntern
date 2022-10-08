public class Main {
    public static void main(String[] args) {
        double[] myList = {1.5, 2.4, 3.1, 4.2, 5.6};

        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);

        }
        System.out.println(total);
        System.out.println(max);
    }


}