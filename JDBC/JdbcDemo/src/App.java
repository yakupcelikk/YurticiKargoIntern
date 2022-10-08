import com.daoimpl.PersonDaoImpl;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class App {
    public static void main(String[] args) {
        PersonDaoImpl pdi = new PersonDaoImpl();
       // pdi.createPersonTable();

      //  Person person = new Person("yako", "baba");
      //  pdi.insert(person);

      //  Person person = pdi.selectById(2);
      //  System.out.println(person.getId()+ ", "+person.getFirstName()+ ", " + person.getLastName());
        List<Person> persons = pdi.selectAll();
        for (Person person: persons) {
            System.out.println(person.getId()+", "+person.getFirstName()+", "+person.getLastName());

        }

      //  pdi.delete(1);
      //  System.out.println(person.getFirstName());
    }
}