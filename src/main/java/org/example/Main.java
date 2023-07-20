package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Ansar");
        System.out.printf("Hello and welcome %s" , employee.getName());

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Ansar","software Engineer",205000,"Noida"));
        employeeList.add(new Employee(2,"Lubna","software Engineer",95000,"Noida"));
        employeeList.add(new Employee(1,"Anuj","software Engineer",85000,"Noida"));
        employeeList.add(new Employee(1,"Afjal","software Engineer",75000,"Delhi"));
        employeeList.add(new Employee(1,"Faiz","Manager",65000,"Delhi"));
        employeeList.add(new Employee(1,"Shariq","Banker",35000,"Mumbai"));
        employeeList.add(new Employee(1,"Tayyab","businnes man",55000,"Dehradun"));

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getLocation));
        System.out.println(collect);

    }
}