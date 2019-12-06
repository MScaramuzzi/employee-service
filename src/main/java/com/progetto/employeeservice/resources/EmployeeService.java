package com.progetto.employeeservice.resources;

import com.progetto.employeeservice.models.Employee;
import com.progetto.employeeservice.models.Progetto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {


    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee ("Mario","Rossi","123",1500),
            new Employee ("Gianluca","Degaetano","666",1200),
            new Employee ("Giuseppe","Verdi","456",1000),
            new Employee ("Francesco","Giuliani","789",2000)

    ));



    public String getAllEmplyees() {
        return employees.toString();

    }

    public Employee getEmployee(String employeeID){

        return employees.stream().filter(e -> e.getEmployeeID().equals(employeeID)).findFirst().get();

    }
}
