package construction.erp.employee.service;


import construction.erp.employee.DAO.EmployeeTypes;

import java.util.List;

public interface EmployeeTypeService {
    public EmployeeTypes create(EmployeeTypes request);
    public List<EmployeeTypes> getAll();
    public EmployeeTypes getById(Long id);
}
