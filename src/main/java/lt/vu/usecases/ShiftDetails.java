package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.entities.Shift;
import lt.vu.persistence.EmployeeDAO;
import lt.vu.persistence.ShiftsDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ViewScoped
@Model
@Getter@Setter
public class ShiftDetails implements Serializable {

    private Shift shift;

    @Inject
    private ShiftsDAO shiftsDAO;

    @Inject
    private EmployeeDAO employeeDAO;

    @Getter@Setter
    private Integer employeeToAssignId;

    @Getter@Setter
    private Shift shiftToCreate = new Shift();

    @PostConstruct
    public void CreateObject(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer shiftId = Integer.parseInt(requestParameters.get("shiftId"));
        this.shift = shiftsDAO.findShiftById(shiftId);
    }
    @Transactional
    public String AssignToNewEmployee(){
        List<Employee> employeesList = shift.getEmployees();
        Employee employeeToAssign = employeeDAO.findEmployeeById(employeeToAssignId);
            employeesList.add(employeeToAssign);
            shift.setEmployees(employeesList);
            shiftsDAO.updateShift(shift);

        return "ShiftDetails?faces-redirect=true&shiftId="+ shift.getShiftId();
    }
    public List<Employee> getFreeEmployees(){
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        List<Employee> employeeShifts = shift.getEmployees();

        return allEmployees.stream().filter(s -> !employeeShifts.contains(s)).collect(Collectors.toList());
    }


}
