package org.example;
import java.util.List;

public class StudentsGroup {
    // Приватні поля для збереження даних про групу
    private Student leader; // Староста
    private List<Student> students; // Список студентів
    private List<String> tasks; // Список завдань

    // Конструктор класу, який приймає параметри для ініціалізації полів
    public StudentsGroup(Student leader, List<Student> students, List<String> tasks) {
        // Перевірка, чи є староста серед студентів
        if (students.contains(leader)) {
            this.leader = leader;
            this.students = students;
            this.tasks = tasks;
        } else {
            // Якщо немає, то викидаємо виняток
            throw new IllegalArgumentException("Leader MUST be in the students list.");
        }
    }

    // Гетери та сетери для доступу та зміни полів
    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        // Перевірка, чи є новий староста серед студентів
        if (students.contains(leader)) {
            this.leader = leader;
        } else {
            // Якщо немає, то викидаємо виняток
            throw new IllegalArgumentException("Leader MUST be in the students list.");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        // Перевірка, чи є староста серед нового списку студентів
        if (students.contains(leader)) {
            this.students = students;
        } else {
            // Якщо немає, то викидаємо виняток
            throw new IllegalArgumentException("Leader MUST be in the students list.");
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    // Метод для додавання студента до групи
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для видалення студента з групи
    public void removeStudent(Student student) {
        // Перевірка, чи не є студент старостою
        if (student.equals(leader)) {
            // Якщо є, то викидаємо виняток
            throw new IllegalArgumentException("Cannot remove the leader");
        } else {
            // Якщо ні, то видаляємо студента
            students.remove(student);
        }
    }

    // Метод для додавання завдання для групи
    public void addTask(String task) {
        tasks.add(task);
    }

    // Метод для позначення завдання як виконаного для зазначеного студента
    public boolean markTaskAsDone(Student student, String task) {
        // Перевірка, чи є студент у групі
        if (students.contains(student)) {
            // Перевірка, чи є завдання у списку
            if (tasks.contains(task)) {
                // Повертаємо true, якщо завдання виконано
                return true;
            } else {
                // Повертаємо false, якщо завдання не знайдено
                return false;
            }
        } else {
            // Викидаємо виняток, якщо студент не у групі
            throw new IllegalArgumentException("Student MUST be in the group.");
        }
    }
}
