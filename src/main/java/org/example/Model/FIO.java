package org.example.Model;

// Класс ФИО создан для примера принципа единственной ответственности

public class FIO {
    String surname;
    String name;
    String patronymic;

    public FIO(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "FIO{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + patronymic + '\'' +
                '}';
    }
}
