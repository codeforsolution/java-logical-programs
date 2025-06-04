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
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = Arrays.asList(new Employee(1, "Ramesh", 25, 25000.00,"Male"),
               // new Employee(2, "Shyam", 65, 85000.00, "Male"),
                new Employee(3, "Mohan", 32,  25000.00,"Male"),
                new Employee(4, "Sohan", 28, 13765.00,"Male"),
                new Employee(8, "Soni", 24, 16765.00,"Female"),
                new Employee(5, "Gita", 29, 25000.00,"Female"),
                new Employee(9, "Sweta", 34, 20000.00,"Female"),
                new Employee(10, "Rakhi", 22, 28000.00,"Female")
        );
        //1. Sort the list by age in descending order then by name in ascending order.
//        List<Employee> employeeList = listEmployees.stream()
//                .sorted(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName))
//                .collect(Collectors.toList());
//
//        System.out.println(employeeList);
//
//        Map<Integer, Employee> mapList = listEmployees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
//        mapList.forEach((k,v) -> System.out.println(v) );
//
//        //2. second-highest salary from a list of employees for a female employee
//       Double secondHighestSalary = listEmployees.stream().filter(e->e.getGender().equals("Female")).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get().getSalary();
//        System.out.println(secondHighestSalary);
        // Find second highest salary from the list of employee

        Double secondHiSalary = listEmployees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHiSalary);

        List<Employee> secondHiSalaryEmpList = listEmployees.stream().filter(e->e.getSalary() == secondHiSalary).collect(Collectors.toList());
        System.out.println(secondHiSalaryEmpList);
    }

}
