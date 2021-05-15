package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.persistence.EmployeeDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Employees {

    @Inject
    private EmployeeDAO employeeDAO;

    @Getter @Setter
    private Employee myEmployee = new Employee();

    @Getter
    private List<Employee> employeesFromDB;

    @PostConstruct
    public void createObject() {this.employeesFromDB = employeeDAO.getAllEmployees();}

    @Transactional
    public String createEmployee(){
        this.employeeDAO.persists(myEmployee);
        return "index?faces-redirect=true";
    }
}
