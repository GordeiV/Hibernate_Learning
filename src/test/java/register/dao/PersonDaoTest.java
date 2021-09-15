package register.dao;

import org.junit.Assert;
import org.junit.Test;
import register.domain.Person;
import register.domain.PersonFemale;
import register.domain.PersonMale;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {
    @Test
    public void findPersons() {
        PersonDao personDao = new PersonDao();
        List<Person> persons = personDao.findPersons();
        persons.forEach(p -> {
            System.out.println("Name: " + p.getFirstName());
            System.out.println("Class for sex: " + p.getClass().getSimpleName());
            System.out.println("Passports: " + p.getPassports().size());
            System.out.println("Birth: " + p.getBirthCertificate());
            if(p instanceof PersonMale) {
                System.out.println("Birth Certificate: " + ((PersonMale)p).getBirthCertificates().size());
                System.out.println("Marriage Certificate: " + ((PersonMale)p).getMarriageCertificates().size());
            } else {
                System.out.println("Birth Certificate: " + ((PersonFemale)p).getBirthCertificates().size());
                System.out.println("Marriage Certificate: " + ((PersonFemale)p).getMarriageCertificates().size());
            }
            System.out.println();
        });
    }
}