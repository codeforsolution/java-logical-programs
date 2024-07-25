/**
 * @Author codeforsolution
 * Date: 19-06-2024
 *
 * Given a list of employees(empId, name, age).
 * 1. Sort the list by age in descending order then by name in ascending order.
 * 2. second-highest salary from a list of employees for a female employee
 **/
package com.codeforsolution.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = Arrays.asList(new Employee(1, "Ramesh", 25, "Male",250000.00),
                new Employee(2, "Shyam", 65, "Male", 32500000.00),
                new Employee(3, "Mohan", 32, "Male", 23456789.00),
                new Employee(4, "Sohan", 28, "Male",9876543.00),
                new Employee(8, "Soni", 24, "Female",3456765.00),
                new Employee(5, "Gita", 29, "Female",23456546.00),
                new Employee(9, "Sweta", 34, "Female",236546.00)
        );
        //1. Sort the list by age in descending order then by name in ascending order.
        List<Employee> employeeList = listEmployees.stream()
                .sorted(Comparator.comparing(Employee::age).reversed().thenComparing(Employee::name))
                .collect(Collectors.toList());

        System.out.println(employeeList);

        Map<Integer, Employee> mapList = listEmployees.stream().collect(Collectors.toMap(Employee::id, Function.identity()));
        mapList.forEach((k,v) -> System.out.println(v) );

        //2. second-highest salary from a list of employees for a female employee
       Double secondHighestSalary = listEmployees.stream().filter(e->e.gender().equals("Female")).sorted(Comparator.comparingDouble(Employee::salary).reversed()).skip(1).findFirst().get().salary();
        System.out.println(secondHighestSalary);


    }

}
