package lt.vu.rest.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

    public EmployeeResponse(){}

    public EmployeeResponse(Integer id, String name, int salary){
        this.employeeId = id;
        this.name = name;
        this.salary = salary;
    }

    private Integer employeeId;

    private String name;

    private int salary;
}