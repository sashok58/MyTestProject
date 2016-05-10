package com.test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentUtils {

    private StudentUtils() {

    }

    public static List<Students> findByFaculty(List<Students> student, String faculty) {
        List<Students> result = new ArrayList<>();
        for (Students students : student) {
            if (Objects.equals(students.getFaculty(), faculty)) {
                result.add(students);
            }
        }
        return result;
    }

    public static List<Students> findByFacultyAndCourse(List<Students> student, String faculty, int course) {
        List<Students> result = new ArrayList<>();
        for (Students students : student) {
            if (Objects.equals(students.getFaculty(), faculty) && Objects.equals(students.getCourse(), course)) {
                result.add(students);
            }
        }
        return result;
    }

    public static List<Students> findByGroupe(List<Students> student, String groupe) {
        List<Students> result = new ArrayList<>();
        for (Students students : student) {
            if (Objects.equals(students.getGroup(), groupe)) {
                result.add(students);
            }
        }
        return result;
    }

    public static List<Students> findByBirthday(List<Students> student, long dateBirthday) {
        List<Students> result = new ArrayList<>();
        for (Students students : student) {
            if (students.getDatebirthday() > dateBirthday) {
                result.add(students);
            }
        }
        return result;
    }

}
