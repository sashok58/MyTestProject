package com.test;


import java.text.ParseException;

import java.util.ArrayList;
import java.util.List;

import static com.test.Utils.getTime;

public class StudentRunner {
    public static void main(String[] args) throws ParseException {
        List<Students> student = new ArrayList<>();


        student.add(new Students(0, "Alex1", "Mitsih5", "Vladimirovich", getTime("dd.mm.yyyy", "25.09.1990"), "Kiev1", "067", "fel1", "1", "zdp-31"));
        student.add(new Students(1, "Alex2", "Mitsih3", "Vladimirovich", getTime("dd.mm.yyyy", "25.09.1986"), "Kiev2", "067", "fel2", "2", "zdp-32"));
        student.add(new Students(3, "Alex3", "Mitsih1", "Vladimirovich", getTime("dd.mm.yyyy", "25.09.1975"), "Kiev3", "067", "fel3", "3", "zdp-33"));


        for (Students students : StudentUtils.findByFaculty(student, "fel3")) {
            System.out.println("students = " + students);
        }

        for (Students students : StudentUtils.findByBirthday(student, getTime("dd.mm.yyyy", "25.09.1975"))) {
            System.out.println("students = " + students);
        }


    }


}
