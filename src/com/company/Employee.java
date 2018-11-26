package com.company;

public class Employee {
    private int id;
    private static int count = 1;
    private String lastName;
    private String firstName;
    private String surname;
    private String dateBirth;
    private String position;
    private String department;
    private int numberRoom;
    private int telefon;
    private String emeil;
    private int salary;
    private String dateWork;
    private String note;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmeil() {
        return emeil;
    }

    public void setEmeil(String emeil) {
        this.emeil = emeil;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateWork() {
        return dateWork;
    }

    public void setDateWork(String dateWork) {
        this.dateWork = dateWork;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Employee() {
        this.id = count++;
    }

    public Employee(int id, String lastName, String firstName, String surname, String dateBirth, String position, String department, int numberRoom, int telefon, String emeil, int salary, String dateWork, String note) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.position = position;
        this.department = department;
        this.numberRoom = numberRoom;
        this.telefon = telefon;
        this.emeil = emeil;
        this.salary = salary;
        this.dateWork = dateWork;
        this.note = note;
    }
}

