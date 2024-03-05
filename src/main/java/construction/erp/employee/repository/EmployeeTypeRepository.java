package construction.erp.employee.repository;


import construction.erp.employee.DAO.EmployeeTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeTypes, Long> {

    @Query(value = "from EmployeeTypes e where e.parentId = :id")
    List<EmployeeTypes> findEmployeeTypeByParent(@Param("id") Long id);
}
