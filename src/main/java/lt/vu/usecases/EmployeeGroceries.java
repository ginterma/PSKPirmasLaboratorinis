package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.entities.Grocery;
import lt.vu.persistence.EmployeeDAO;
import lt.vu.persistence.GroceriesDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;
@Model
public class EmployeeGroceries implements Serializable {

    @Inject
    private EmployeeDAO employeeDAO;

    @Inject
    private GroceriesDAO groceriesDAO;

    @Getter@Setter
    private Employee employee;

    @Getter@Setter
    private Grocery groceryToCreate = new Grocery();

    @PostConstruct
    public void createObject(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer employeeId = Integer.parseInt(requestParameters.get("employeeId"));
        this.employee = employeeDAO.findEmployeeById(employeeId);
    }

    @Transactional
    public String createGroceries(){
           groceryToCreate.setEmployee(this.employee);
            groceriesDAO.persists(groceryToCreate);
           return "EmployeeDetails?faces-redirect=true&employeeId=" + this.employee.getEmployeeId();
    }
    @Transactional
   public String removeGroceries(Integer id){
        groceriesDAO.removes(groceriesDAO.findGroceriesById(id));
        return "EmployeeDetails?faces-redirect=true&employeeId=" + this.employee.getEmployeeId();

    }




}
