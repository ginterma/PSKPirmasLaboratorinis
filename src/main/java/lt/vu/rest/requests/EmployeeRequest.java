package lt.vu.rest.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmployeeRequest {

    private Integer employeeId;

    private String name;

    private int salary;
}