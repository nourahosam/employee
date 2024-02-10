package construction.erp.employee.repository;


import construction.erp.employee.DAO.EmployeeTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeTypes, Long> {
}
