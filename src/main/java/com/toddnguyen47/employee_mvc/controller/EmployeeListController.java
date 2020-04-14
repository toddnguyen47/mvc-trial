package com.toddnguyen47.employee_mvc.controller;

import java.util.List;

import com.toddnguyen47.employee_mvc.model.Employee;
import com.toddnguyen47.employee_mvc.model.EmployeeModel;
import com.toddnguyen47.employee_mvc.view.EmployeeListView;

public class EmployeeListController {
  private EmployeeListView employeeListView_;
  private EmployeeModel employeeModel_;

  public EmployeeListController() {
    employeeModel_ = new EmployeeModel();
  }

  public void setEmployeeListView(EmployeeListView employeeListView) {
    employeeListView_ = employeeListView;
  }

  public List<Employee> getListOfEmployees() {
    return employeeModel_.getListOfEmployees();
  }

  public List<String> getListOfAttributes() {
    return employeeModel_.getListOfAttributes();
  }

  public void print() {
    for (Employee e : employeeModel_.getListOfEmployees()) {
      System.out.println(
          String.format("id: %d, name: %s, jobTitle: %s", e.getId(), e.getName(), e.getJobTitle()));
    }
  }
}
