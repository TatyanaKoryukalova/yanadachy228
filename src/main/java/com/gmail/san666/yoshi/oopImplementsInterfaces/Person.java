package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Person implements Worker {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private boolean isAgeGreaterThanSalary(double salary) {
        return age >= salary;
    }

    @Override
    public void salaryValidate(double salary) {
        if (isAgeGreaterThanSalary(salary)) {
            throw new SalaryLessThanAgeException("Salary cannot be less than age!");
        }
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printNameAndAge() {
        System.out.println(name + ", " + age + "y.o.");
    }


    // region getters/setters
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // endregion
}
