package com.codeforsolution.logical.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Java8ProgramsOnEmployee {

    public static void main(String[] args) {

        List<Employee> employeeList = Employee.getEmployee();

        //Find all Employees which age is less than 26.
        List<Employee> empListAgeLessThan26 = employeeList.stream().filter(employee -> employee.getAge()<26).collect(Collectors.toList());
        System.out.println("All Employees which age is less than 26 : " + employeeList);

        //Find all Employee name which age is less than 26.
        List<String> empNameAgeLessThan26 = employeeList.stream().filter(employee -> employee.getAge()<26).map(Employee::getName).toList();

        System.out.println("All Employee name which age is less than 26 : " + empNameAgeLessThan26);

    }
}
