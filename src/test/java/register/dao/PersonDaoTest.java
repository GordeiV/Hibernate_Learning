package register.dao;

import org.junit.Assert;
import org.junit.Test;
import register.domain.Person;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {
    @Test
    public void findPersons() {
        PersonDao personDao = new PersonDao();
        List<Person> persons = personDao.findPersons();
        persons.forEach(p -> {
            System.out.println(p.getFirstName());
            System.out.println(p.getClass().getSimpleName());
            System.out.println(p.getPassports().size());
        });
    }
}