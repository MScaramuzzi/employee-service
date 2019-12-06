package com.progetto.employeeservice.resources;

import com.progetto.employeeservice.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
public class EmployeeResource {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RestTemplate restTemplate;
//usare la porta http://localhost:8082/employees
    @RequestMapping("/employees")
    public String getEmployee(){

        return employeeService.getAllEmplyees();
    }

    @RequestMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID){

        return employeeService.getEmployee(employeeID);
    }
}
