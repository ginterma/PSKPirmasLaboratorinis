package lt.vu.mybatis.model;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.EMPLOYEE.Employee_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private Integer employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.EMPLOYEE.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private String name;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.EMPLOYEE.Salary
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    private Integer salary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.EMPLOYEE.Employee_id
     *
     * @return the value of PUBLIC.EMPLOYEE.Employee_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.EMPLOYEE.Employee_id
     *
     * @param employeeId the value for PUBLIC.EMPLOYEE.Employee_id
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.EMPLOYEE.Name
     *
     * @return the value of PUBLIC.EMPLOYEE.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.EMPLOYEE.Name
     *
     * @param name the value for PUBLIC.EMPLOYEE.Name
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.EMPLOYEE.Salary
     *
     * @return the value of PUBLIC.EMPLOYEE.Salary
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.EMPLOYEE.Salary
     *
     * @param salary the value for PUBLIC.EMPLOYEE.Salary
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}