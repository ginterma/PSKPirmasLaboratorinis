package lt.vu.rest;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.persistence.EmployeeDAO;
import lt.vu.rest.requests.EmployeeRequest;
import lt.vu.rest.responses.EmployeeResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeController {

    @Inject
    @Getter
    @Setter
    private EmployeeDAO employeeDAO;

    @Path("/{employeeId}")
    @GET
    public EmployeeResponse getById(@PathParam("employeeId") Integer id){
        Employee employee = employeeDAO.findEmployeeById(id);

        EmployeeResponse employeeResponse = new EmployeeResponse(
                employee.getEmployeeId(), employee.getName(), employee.getSalary());

        return employeeResponse;
    }
    @Path("/")
    @GET
    public List<EmployeeResponse> getEmployees(){
        List<Employee> employeeList = employeeDAO.getAllEmployees();

        List<EmployeeResponse> employeeResponseList = new ArrayList<>();

        for(Employee employee: employeeList){
            EmployeeResponse employeeResponse = new EmployeeResponse(
                    employee.getEmployeeId(), employee.getName(), employee.getSalary());

            employeeResponseList.add(employeeResponse);
        }

        return employeeResponseList;
    }

    @Path("/{employeeId}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public EmployeeResponse update(EmployeeRequest employeeRequest, @PathParam("employeeId") Integer id){
        Employee employee = employeeDAO.findEmployeeById(id);

        if (employee == null){
            throw new IllegalArgumentException("Employee with the id "+id+" not found");
        }
        employee.setEmployeeId(employeeRequest.getEmployeeId());
        employee.setName(employeeRequest.getName());
        employee.setSalary(employeeRequest.getSalary());

        employeeDAO.updateEmployee(employee);
        EmployeeResponse employeeResponse = new EmployeeResponse(
                employee.getEmployeeId(), employee.getName(), employee.getSalary());

        return employeeResponse;
    }

    @Path("/")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public EmployeeResponse create(EmployeeRequest employeeRequest){
        Employee employee = new Employee();

        employee.setEmployeeId(employeeRequest.getEmployeeId());
        employee.setName(employeeRequest.getName());
        employee.setSalary(employeeRequest.getSalary());
        employeeDAO.persists(employee);

        EmployeeResponse employeeResponse = new EmployeeResponse(
                employee.getEmployeeId(), employee.getName(), employee.getSalary());

        return employeeResponse;
    }
}
