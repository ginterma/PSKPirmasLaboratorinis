package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Employee;
import org.mybatis.cdi.Mapper;

@Mapper
public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.EMPLOYEE
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.EMPLOYEE
     *
     * @mbg.generated Fri Mar 26 19:18:07 EET 2021
     */
    List<Employee> selectAll();
}