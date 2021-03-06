package com.example.employee.entity;
//import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;
@Entity

public class Company {
  @Id
  @GeneratedValue
  private Long id;
  private String companyName;
  private Integer employeesNumber;

  public Company() {
  }

  public Company(String companyName, Integer employeesNumber) {
    this.companyName = companyName;
    this.employeesNumber = employeesNumber;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Integer getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(Integer employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

}
