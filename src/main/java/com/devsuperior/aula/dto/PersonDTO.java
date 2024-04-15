package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {
    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDTO(Long id, Long departmentId, Double salary, String name) {
        this.id = id;
        this.departmentId = departmentId;
        this.salary = salary;
        this.name = name;
    }

    public PersonDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentId = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
