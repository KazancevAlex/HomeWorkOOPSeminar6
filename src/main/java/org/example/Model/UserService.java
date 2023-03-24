package org.example.Model;

import java.util.Date;
import java.util.List;

public class UserService implements DataService{


    @Override
    public User create(Student student) {
        return new Student(1, new Date(), "Петров Петр Петрович");
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(2, new Date(), "Иванов Иван Иванович");
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
