package com.codeforsolution.logical.java8;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
    private String gender;
    private String department;
    private String city;

    public static List<Employee> getEmployee() {
        return Arrays.asList(new Employee(1, "Ramesh", 25, 25000.00, "Male", "Phy", "Pune"),
                // new Employee(2, "Shyam", 65, 85000.00, "Male"),
                new Employee(3, "Mohan", 32, 25000.00, "Male", "Math", "Banglore"),
                new Employee(4, "Sohan", 28, 13765.00, "Male", "Math", "Hyderabad"),
                new Employee(8, "Soni", 24, 16765.00, "Female", "Phy", "Pune"),
                new Employee(5, "Gita", 29, 26000.00, "Female", "Che", "Delhi"),
                new Employee(9, "Sweta", 34, 20000.00, "Female", "Che","Delhi"),
                new Employee(10, "Rakhi", 22, 28000.00, "Female", "Phy", "Banglore")
        );
    }
}

