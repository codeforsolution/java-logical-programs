package com.codeforsolution.logical.java;

import java.util.Objects;

public class EmployeeImmutable {

    private final Integer id;
    private final String name;
    private final Integer age;
    private final String gender;
    private final Double salary;

    public EmployeeImmutable(Integer id, String name, Integer age, Double salary, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImmutable that = (EmployeeImmutable) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(gender, that.gender) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, salary);
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
