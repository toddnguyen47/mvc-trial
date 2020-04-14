package com.toddnguyen47.employee_mvc;

import com.toddnguyen47.employee_mvc.view.EmployeeListView;

public class EmployeeMvc {
  public static void main(String[] args) {
    EmployeeListView employeeListView = new EmployeeListView();
    employeeListView.execute();
  }
}
