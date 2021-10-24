package com.gmail.san666.yoshi.oop;

import java.util.Arrays;

public class Company {
    private Person[] staff;
    private String name;

    public Company(){

    }

    public Company(String name, Person[] staff){
        this.name = name;
        this.staff = staff;
    }

    public void hirePerson(Person newStaff) {
        staff = Arrays.copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newStaff;
        newStaff.setCompanyName(this.getName());

    }

    public void firePerson(Person firedStaff) {
        Person[] newStaffArray = new Person[staff.length - 1];
        int counter = 0;
        for (int i = 0; i < staff.length; i++) {
            Person person = staff[i];
            if (person != firedStaff) {
                newStaffArray[counter] = person;
                counter++;
            }
        }
        staff = newStaffArray;
        firedStaff.setCompanyName(null);
    }
//todo вернуть String со всеми именами(+ др. свойства), метод, к-й печатать
    public void printAllStuff() {
        for (Person stuff : staff) {
            System.out.println(stuff.getName());
        }
    }


    //region getters/setters
    public Person[] getStaff() {
        return staff;
    }

    public void setStaff(Person[] staff) {
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getElement(int index) {
        return staff[index];
    }

    //endregion

}