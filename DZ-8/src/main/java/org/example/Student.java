package org.example;

public class Student {

    // Приватні поля для збереження даних про студента
    private int id;
    private String firstName;
    private String secondName;

    // Конструктор класу, який приймає параметри для ініціалізації полів
    public Student(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    // Гетери та сетери для доступу та зміни полів
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

}
