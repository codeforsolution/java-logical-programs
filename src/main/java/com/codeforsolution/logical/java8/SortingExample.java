/**
 * @Author codeforsolution
 * Date: 19-06-2024
 * <p>
 * Given a list of employees(empId, name, age).
 * 1. Sort the list by age in descending order then by name in ascending order.
 * 2. second-highest salary from a list of employees for a female employee
 **/
package com.codeforsolution.logical.java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = Employee.getEmployee();
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

        List<Employee> secondHiSalaryEmpList = listEmployees.stream().filter(e -> e.getSalary() == secondHiSalary).collect(Collectors.toList());
        System.out.println(secondHiSalaryEmpList);

        //double the salary of the employee which have salary less than 20k

        List<Double> doubleSalaryOfEmployees = listEmployees.stream().filter(e -> e.getSalary() > 20000).map(e -> e.getSalary() * 2).collect(Collectors.toList());
        System.out.println("double salary of the employee " + doubleSalaryOfEmployees);

        List<Employee> employees = listEmployees.stream().filter(e -> e.getSalary() < 20000).peek(e -> e.setSalary(e.getSalary() * 2)).collect(Collectors.toList());
        System.out.println("Employee list which have salary less than 20k" + employees);

        //department max salary employee

        Map<String, Double> maxSalaryByDept = listEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        optionalEmployee -> optionalEmployee.map(Employee::getSalary).orElse(0.0))));

    }

}
