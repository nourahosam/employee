package construction.erp.employee.controller;

import construction.erp.employee.DAO.EmployeeTypes;
import construction.erp.employee.service.EmployeeTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employeeType")
public class EmployeeTypeApi {

    @Autowired
    EmployeeTypeService employeeTypeService;

    ModelMapper modelMapper = new ModelMapper();

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody EmployeeTypes request){
        EmployeeTypes responseEmp = employeeTypeService.create(request);
        return ResponseEntity.ok(responseEmp);

    }

    @GetMapping
    public ResponseEntity<Object> getAll(){

        List<EmployeeTypes> employees = employeeTypeService.getAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Object> getById(@PathVariable(value="id") Long id){
        EmployeeTypes employee = employeeTypeService.getById(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/getByParent/{id}")
    public ResponseEntity<Object> getByParent(@PathVariable(value = "id") Long id){
        List<EmployeeTypes> employeeTypesList = employeeTypeService.getChildren(id);
        return ResponseEntity.ok(employeeTypesList);
    }
}