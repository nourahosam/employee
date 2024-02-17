package construction.erp.employee.controller;

import construction.erp.employee.DAO.Employee;
import construction.erp.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employee")
public class EmployeeApi {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    EmployeeService employeeService;

    ModelMapper modelMapper = new ModelMapper();

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Employee request){
        Employee responseEmp = employeeService.create(request);
//        Employee response = new Employee();
//        modelMapper.map(responseEmp, response);
        return ResponseEntity.ok(responseEmp);

    }

    @GetMapping
    public ResponseEntity<Object> getAll(){

        List<Employee> employees = employeeService.getAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/getById")
    public ResponseEntity<Object> getById(@PathVariable Long id){
        Employee employee = employeeService.getById(id);
        return ResponseEntity.ok(employee);
    }
}
