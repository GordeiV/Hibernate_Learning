package register.dao;

import register.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class PersonDao {

    private EntityManager entityManager;


    public PersonDao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        this.entityManager = factory.createEntityManager();
    }

    public List<Person> findPersons() {
        Query query = entityManager.createNamedQuery("Person.findPersons");
        query.setParameter("personId", 1L); // везде в Query, где стояла personId, будет 1
        return query.getResultList();
    }
}
