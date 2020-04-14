package com.toddnguyen47.employee_mvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class EmployeeModel {
  private final String DATA_PATH = "data.json";
  Path jsonFilePath_;
  private List<Employee> listOfEmployees_;
  private List<String> employeeAttributes_;
  private Gson gson_;

  public EmployeeModel() {
    jsonFilePath_ = Path.of(System.getProperty("user.dir"), this.DATA_PATH);
    listOfEmployees_ = new ArrayList<>();
    gson_ = new Gson();
    employeeAttributes_ = new ArrayList<>();
    this.addAttributes();
    this.readJson();
  }

  public Employee findEmployeeById(int id) {
    Employee employee = null;
    for (Employee e : listOfEmployees_) {
      if (e.getId() == id) {
        employee = e;
        break;
      }
    }
    return employee;
  }

  public void addEmployee(Employee e) {
    listOfEmployees_.add(e);
  }

  public void readJson() {
    try {
      BufferedReader bufferedReader = new BufferedReader(
          new FileReader(new File(jsonFilePath_.toUri())));

      JsonResponse response = gson_.fromJson(bufferedReader, JsonResponse.class);
      listOfEmployees_ = response.getEmployees();

      bufferedReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void writeJson() {
    try {
      Writer writer = new FileWriter(jsonFilePath_.toString());
      gson_.toJson(listOfEmployees_, writer);
      writer.flush();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<Employee> getListOfEmployees() {
    return listOfEmployees_;
  }

  public List<String> getListOfAttributes() {
    return employeeAttributes_;
  }

  private void addAttributes() {
    employeeAttributes_.add("ID");
    employeeAttributes_.add("Name");
    employeeAttributes_.add("Job Title");
  }
}
