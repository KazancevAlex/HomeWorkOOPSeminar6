package org.example.Model;

import java.util.List;

// TeachGroupService показывает принцип инверсии зависимостей

public interface TeachGroupService {
    public String createGroup(List<Student> students);


}
