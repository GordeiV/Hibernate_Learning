//package hibernate_example.manager;
//
//import hibernate_example.domain.Person;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class PersonManager {
//    public static void main(String[] args) {
////        sessionExample();
//
//        jpaExample();
//    }
//
//    private static void jpaExample() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
//
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//
//        Person p = new Person();
//        p.setFirstName("Алексей");
//        p.setLastName("Федеров");
//        em.persist(p); // как session.save(p)
//
//        Long id = p.getPersonId();
//        System.out.println(id);
//
//        em.getTransaction().commit();
//        em.close();
//
//        em = emf.createEntityManager();
//        List<Person> list = em.createQuery("FROM Person", Person.class).getResultList();
//        list.forEach(System.out::println);
//        em.close();
//    }
//
//    private static void sessionExample() {
//        SessionFactory sf = buildSessionFactory();
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        Session session = sf.openSession();
//
//        Transaction transaction = session.getTransaction();
//        transaction.begin();
//
//        Person p = new Person();
//        p.setFirstName("Василий");
//        p.setLastName("Сидоров");
//
//        Long id = (Long) session.save(p);
//        System.out.println(id);
//
//        transaction.commit();
//        session.close();
//
//        session = sf.openSession();
//        Person person = session.get(Person.class, id);
//        System.out.println(person);
//        session.close();
//
//        session = sf.openSession();
//
//        List<Person> list = session.createQuery("FROM Person", Person.class).list();
//        list.forEach(p1 -> System.out.println(p1));
//
//        session.close();
//    }
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                    .configure("hibernate.cfg.xml").build();
//
//            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
//
//            return metadata.getSessionFactoryBuilder().build();
//        } catch (Throwable ex) {
//
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//}
