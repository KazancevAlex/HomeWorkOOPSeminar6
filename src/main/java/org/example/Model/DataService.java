package org.example.Model;

import java.util.List;

// интерфейс DataService показывает принцип разделения интерфейса

public interface DataService {
    User create(Student student);
    User create(Teacher teacher);
    List<User> read(List<User> users);

}
