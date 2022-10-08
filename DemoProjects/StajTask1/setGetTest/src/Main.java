

public class Main {
    public static void main(String[] args) {
        class Numbers {
            private int number1 = 50;
            private int number2 = 100;
            private List<Integer> list;

            public Numbers() {
                list = new ArrayList<Integer>();
                list.add(number1);
                list.add(number2);
            }

            int getNumber(int pos)
            {
                return list.get(pos);
            }
        }

        class Test {
            private Numbers numbers;

            public Test(){
                numbers = new Numbers();
                int number1 = numbers.getNumber(0);
                int number2 = numbers.getNumber(1);
            }
        }
    }
}