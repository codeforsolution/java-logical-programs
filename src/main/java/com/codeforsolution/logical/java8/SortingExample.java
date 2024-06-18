/**
 * @Author codeforsolution
 * Date: 19-06-2024
 *
 * Given a list of employees(empId, name, age).
 * Sort the list by age in descending order then by name in ascending order.
 **/
package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = Arrays.asList(new Employee(1, "Ramesh", 25, "Male"),
                new Employee(2, "Shyam", 65, "Male"),
                new Employee(3, "Mohan", 32, "Male"),
                new Employee(4, "Sohan", 28, "Male"),
                new Employee(8, "Soni", 24, "Female"),
                new Employee(5, "Gita", 29, "Female")
        );
        List<Employee> employeeList = listEmployees.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(employeeList);
    }

}
