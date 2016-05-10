package com.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");

        try {
            student.add(new Students(0, "Alex1", "Mitsih", "Vladimirovich", dateFormat.parse("25.09.1990").getTime(), "Kiev1", "067", "fel1", "1", "zdp-31"));
            student.add(new Students(0, "Alex2", "Mitsih", "Vladimirovich", dateFormat.parse("25.09.1985").getTime(), "Kiev2", "067", "fel2", "2", "zdp-32"));
            student.add(new Students(0, "Alex3", "Mitsih", "Vladimirovich", dateFormat.parse("25.09.1979").getTime(), "Kiev3", "067", "fel3", "3", "zdp-33"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Students students : StudentUtils.findByFaculty(student, "fel2")) {
            System.out.println("students = " + students);
        }


    }
}
