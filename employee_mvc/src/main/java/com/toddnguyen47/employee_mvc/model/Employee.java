package com.toddnguyen47.employee_mvc.model;

public class Employee {
  private int id;
  private String name;
  private String jobTitle;

  public Employee(int id, String name, String jobTitle) {
    this.id = id;
    this.name = name;
    this.jobTitle = jobTitle;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getJobTitle() {
    return jobTitle;
  }
}
