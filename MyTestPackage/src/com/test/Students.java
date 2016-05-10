package com.test;


public class Students {
    private int id;
    private String name;
    private String surname;
    private String patronimyc;
    private long datebirthday;
    private String address;
    private String telephone;
    private String faculty;
    private String course;
    private String group;


    public Students(int id, String name, String surname, String patronimyc, long datebirthday, String address, String telephone, String faculty, String course, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronimyc = patronimyc;
        this.datebirthday = datebirthday;
        this.address = address;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronimyc() {
        return patronimyc;
    }

    public void setPatronimyc(String patronimyc) {
        this.patronimyc = patronimyc;
    }

    public long getDatebirthday() {
        return datebirthday;
    }

    public void setDatebirthday(long datebirthday) {
        this.datebirthday = datebirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronimyc='" + patronimyc + '\'' +
                ", datebirthday=" + datebirthday +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
