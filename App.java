package ru.anna.RestApiConsumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.anna.RestApiConsumer.entity.Person;




public class App {
    public static void main( String[] args ) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 1); //получаем человека по айди
//            System.out.println(person.getName());

//            Person person1 = new Person("Tomas1",34); //добавляем новых людей с автоматическим айди(при создании таблицы указываем IDENTITY)
//            Person person2 = new Person("Tomas2",88);
//            Person person3 = new Person("Tomas3",45);
//            Person person4 = new Person("Tomas4",22);
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//            session.save(person4);

//            Person person = session.get(Person.class,2); //обновление данных
//            person.setName("New name");

//            Person person = session.get(Person.class,2); //удаление данных
//            session.delete(person);

            Person person = new Person("Random",33); //получаем сразу новое айди после операции
            session.save(person);


            session.getTransaction().commit();

            System.out.println(person.getId()); //новый айди
        } finally {
            sessionFactory.close();
        }
    }
}
