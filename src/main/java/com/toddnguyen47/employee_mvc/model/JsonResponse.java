package com.toddnguyen47.employee_mvc.model;

import java.util.List;

public class JsonResponse {
  private List<Employee> employees;

  public JsonResponse(List<Employee> employees) {
    this.employees = employees;
  }

  public List<Employee> getEmployees() {
    return this.employees;
  }
}
