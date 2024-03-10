package ru.anna.RestApiConsumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.anna.RestApiConsumer.entity.Person;

import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
//////////////////////////////////////////////////////////////////////////////////////////////

//            Person person = session.get(Person.class, 1); //получаем человека по айди
//            System.out.println(person.getName());

//////////////////////////////////////////////////////////////////////////////////////////////
//
//            Person person1 = new Person("Tomaaasfaf", 54); //добавляем новых людей с автоматическим айди(при создании таблицы указываем IDENTITY)
//            Person person2 = new Person("Katy", 88);
//            Person person3 = new Person("Rikki", 49);
//            Person person4 = new Person("Tomas4214144", 12);
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//            session.save(person4);
//////////////////////////////////////////////////////////////////////////////////////////////

//            Person person = session.get(Person.class,2); //обновление данных
//            person.setName("New name");
//////////////////////////////////////////////////////////////////////////////////////////////

//            Person person = session.get(Person.class,2); //удаление данных
//            session.delete(person);
////////////////////////////////////////////////////////////////////////////////////////////////
//            Person person = new Person("Random",33); //получаем сразу новое айди после операции
//            session.save(person);
//////////////////////////////////////////////////////////////////////////////////////////////
//            List<Person> people = session.createQuery("FROM Person").getResultList(); // HQL запрос(обращается к сущности)

//            List<Person> people = session.createQuery("FROM Person WHERE  age > 20").getResultList();

//            List<Person> people = session.createQuery("FROM Person WHERE name LIKE 'T%'").getResultList();

//            session.createQuery("update Person set name='Test' where age > 80").executeUpdate();

//            session.createQuery("delete Person where age > 80").executeUpdate();

//            for (Person person: people) {
//                System.out.println(person);
//            }

//////////////////////////////////////////////////////////////////////////////////////////////
            session.getTransaction().commit();
//
//            System.out.println(person.getId()); //новый айди
        } finally {
            sessionFactory.close();
        }
    }
}
