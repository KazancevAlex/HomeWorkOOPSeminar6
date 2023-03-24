package org.example.Model;

import java.util.List;

public class SecondCourse implements TeachGroupService{
    @Override
    public String createGroup(List<Student> students) {
        return "Студенты второго курса" + students;
    }
}
