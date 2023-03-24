package org.example.View;

import org.example.Model.TeachGroup;
import org.example.Model.User;

import java.util.List;

// класс View с принципом открытости-закрытости

public class View {
    StringBuilder sb = new StringBuilder();

    public String studentView(List<User> students) {
        for (User s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
    public String teachGroupView(List<TeachGroup> teachGroups) {
        for (TeachGroup t : teachGroups) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
