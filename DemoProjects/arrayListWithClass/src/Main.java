import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers= new ArrayList<Customer>();
        customers.add(new Customer(1,"Yakup","Çelik"));
        customers.add(new Customer(2,"Derin","Çelik"));
        customers.add(new Customer(3,"Derya","Çelik"));

        customers.remove(new Customer(1,"Yakup","Çelik"));
        for(Customer customer: customers){
            System.out.println(customer.getFirstName());
        }
    }
}