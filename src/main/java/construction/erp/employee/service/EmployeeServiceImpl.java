package construction.erp.employee.service;

import construction.erp.employee.DAO.Employee;
import construction.erp.employee.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public Employee create(Employee request){
//        Employee emp = new Employee();
//        modelMapper.map(request, emp);
        return employeeRepository.save(request);
    }

    @Override
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(Long id){
        return employeeRepository.getReferenceById(id);
    }
}
