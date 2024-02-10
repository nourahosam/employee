package construction.erp.employee.DAO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee_types")
@Setter
@Getter
@ToString
public class EmployeeTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private EmployeeTypes parent;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "parent")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Set<EmployeeTypes> children;

    @Column(name = "parent_id",insertable=false, updatable=false)
    private Long parentId;

}
