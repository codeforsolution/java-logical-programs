package com.codeforsolution.logical.java8.groupby;

import com.codeforsolution.logical.java8.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupByEmpCity {
    public static void main(String[] args) {

        List<Employee> employeeList = Employee.getEmployee();
        Map<String, List<Employee>> groupByCity = employeeList.stream().collect(groupingBy(Employee::getCity, Collectors.toList()));

        //System.out.println("Group by Employee City :" + groupByCity);

        Map<String, Employee> maxSalaryByDepartment = employeeList
                .stream()
                .collect(
                        groupingBy(e -> e.getDepartment(),
                                collectingAndThen(
                                        maxBy(Comparator.comparingDouble(e -> e.getSalary())),
                                        Optional::get)));
        //System.out.println("Max salary by department "+ maxSalaryByDepartment);

        Map<String, Optional<Employee>> collect = employeeList
                                                        .stream()
                                                            .collect(
                                                                    groupingBy(Employee::getDepartment,
                                                                            reducing(BinaryOperator.maxBy(
                                                                                    Comparator.comparing(Employee::getSalary)))));
        System.out.println(collect);
    }
}
