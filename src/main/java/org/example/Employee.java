package org.example;

public class Employee {

    int id;
    String name;
    String title;
    double salary;

    String location;


    public Employee() {
    }

    public Employee(int id, String name, String title, double salary, String location) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.salary = salary;
        this.location = location;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
