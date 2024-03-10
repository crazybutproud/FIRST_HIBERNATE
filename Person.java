package ru.anna.RestApiConsumer.entity;

import jakarta.persistence.*;

@Entity //класс связан с бд
@Table(name = "Person") //название подходящей таблицы
public class Person { //должен быть пустой конструктор и поле айди
    @Id // primary key
    @Column(name = "id") // записываем название подходящего столбца бд
    @GeneratedValue(strategy = GenerationType.IDENTITY) //хибер не думает о генерации айди(тип генерации)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public Person () {
    }

    public Person (String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString () {
        return this.name + " , " + this.age;
    }
}
