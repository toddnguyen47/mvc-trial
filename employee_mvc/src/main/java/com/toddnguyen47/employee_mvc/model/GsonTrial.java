package com.toddnguyen47.employee_mvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.List;

import com.google.gson.Gson;

public class GsonTrial {
  public static final String DATA_PATH = "data.json";

  public void execute() {
    try {
      Gson g = new Gson();
      Path path = Path.of(System.getProperty("user.dir"), DATA_PATH);
      BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path.toUri())));

      JsonResponse response = g.fromJson(bufferedReader, JsonResponse.class);
      List<Employee> listOfEmployees = response.getEmployees();
      for (Employee e : listOfEmployees)
        System.out.println(String.format("id: %d, name: %s, jobTitle: %s", e.getId(), e.getName(),
            e.getJobTitle()));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
