package com.codeforsolution.logical.java;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

    private final Integer id;
    private final String name;
    private final EmployeeImmutable employee;
    private final List<String> mobileNumber;

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public ImmutableClass(Integer id, String name, EmployeeImmutable employee, List<String> mobileNumber) {
        this.id = id;
        this.name = name;
        this.employee = employee;
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeImmutable getEmployee() {
        return new EmployeeImmutable(employee.getId(), employee.getName(), getEmployee().getAge(), employee.getSalary(),employee.getGender());
    }

    public List<String> getMobileNumber() {
        return new ArrayList<>(mobileNumber);
    }
}
