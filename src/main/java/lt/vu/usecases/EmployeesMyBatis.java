package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mybatis.dao.EmployeeMapper;
import lt.vu.mybatis.model.Employee;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
@Model
public class EmployeesMyBatis {
    @Inject
    private EmployeeMapper employeeMapper;

    @Getter
    List<Employee> allEmployees;

    @Getter@Setter
    private Employee employeeToCreate = new Employee();

    @PostConstruct
    public void init(){this.getAllEmployees();}

    public void getEmployeesFromDB(){this.allEmployees = employeeMapper.selectAll();}

    @Transactional
    public String createEmployee(){
    employeeMapper.insert(employeeToCreate);
    return "EmployeesMyBatis?faces-redirect=true";
    }
}
