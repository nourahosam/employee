package construction.erp.employee.DAO;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity(name = "employee")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personnelNo;
    @Column(name = "english_name")
    private String englishName;
    @Column(name = "arabic_name")
    private String arabicName;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "contract_profession")
    private String contractProf;
    @Column(name = "religion")
    private String religion;
    @Column(name = "hiring_type")
    private String hiringType;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "email")
    private String email;
    @Column(name = "worker_type")
    private String workerType;
    @Column(name = "legal_entity")
    private String legalEntity;
    @Column(name = "job_titles")
    private String jobTitles;
    @Column(name = "contract_duration")
    private LocalDate ContractDuration;
    @Column(name = "contract_end_dt")
    private LocalDate ContractEndDt;
    @Column(name = "iqama_profession")
    private String IqamaProfession;
    @Column(name = "aramco_id")
    private Long AramcoID;
    @Column(name = "sec_id")
    private Long SEC_ID;
    @Column(name = "branch_name")
    private String BranchName;
//    private String VacationStatus;
    @Column(name = "camp_location")
    private String CampLocation;

    ///////////////////////////RELATIONSHIPS//////////////////////

//    @ManyToOne
    @Column(name = "emp_type_id")
    private Long empTypeId;



}
