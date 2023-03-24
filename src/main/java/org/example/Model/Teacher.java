package org.example.Model;

import java.util.Date;
import java.util.List;

// Класс Учитель с принципом подстановки Барбары Лисков

public class Teacher extends User {
    int serv;
    List<Integer> group;

    public Teacher(int id, Date dateBirth, String fio) {
        super(id, dateBirth, fio);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Учитель{" +
                "стаж=" + serv +
                ", группа=" + group +
                ", id=" + id +
                ", День рождения=" + dateBirth +
                ", ФИО Учителя='" + fio + '\'' +
                '}';
    }
}
