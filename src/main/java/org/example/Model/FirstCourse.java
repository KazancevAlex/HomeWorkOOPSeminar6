package org.example.Model;

import java.util.List;

public class FirstCourse implements TeachGroupService{
    @Override
    public String createGroup(List<Student> students) {
        return "Студенты первого курса" + students;
    }
}
