package ru.anna.RestApiConsumer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //класс связан с бд
@Table(name = "Person") //название подходящей таблицы
public class Person { //должен быть пустой конструктор и поле айди
    @Id // primary key
    @Column(name = "id") // записываем название подходящего столбца бд
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public Person () {
    }

    public Person(int id, String name, int age) {
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
}
