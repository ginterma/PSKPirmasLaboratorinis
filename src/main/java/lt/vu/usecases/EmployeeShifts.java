package lt.vu.usecases;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.entities.Shift;
import lt.vu.persistence.EmployeeDAO;
import lt.vu.persistence.ShiftsDAO;

@Model
@ViewScoped
@Named
@Getter @Setter
public class EmployeeShifts implements Serializable
{
    @Inject
    private EmployeeDAO employeeDAO;

    @Inject
    private ShiftsDAO shiftsDAO;

    @Getter @Setter
    private Employee employee;

    @Getter @Setter
    private Shift shiftToCreate = new Shift();

    @Getter@Setter
    private Integer shiftToAssignId = 0;

    @PostConstruct
    public void createObject(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer employeeId = Integer.parseInt(requestParameters.get("employeeId"));
        this.employee = employeeDAO.findEmployeeById(employeeId);
    }

    List<Employee> employees = new ArrayList<>();
    @Transactional
    public String addShifts()
    {         List<Shift> shiftList = employee.getShifts();
        Shift shiftToAssign = shiftsDAO.findShiftById(shiftToAssignId);
        if (!shiftList.contains(shiftToAssign)) {
            shiftList.add(shiftToAssign);
            employee.setShifts(shiftList);
            employeeDAO.updateEmployee(employee);
        }
        return "EmployeeDetails?faces-redirect=true&employeeId="+ this.employee.getEmployeeId();
    }



}
