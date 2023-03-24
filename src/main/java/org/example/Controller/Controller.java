package org.example.Controller;

import org.example.Model.*;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService us = new UserService();
        List<User> users = new ArrayList<>();
        users.add(us.create(new Student()));
        users.add(us.create(new Teacher()));
        List<TeachGroup> teachGroups = new ArrayList<>();
        teachGroups.add(new TeachGroup<>());
        us.read(users);
        View view = new View();
        System.out.println(view.studentView(users));
        System.out.println(view.teachGroupView(teachGroups));

    }
}