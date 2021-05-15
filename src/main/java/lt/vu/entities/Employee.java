package lt.vu.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Employee.findAll", query = "select a from Employee as a")
})
@Getter@Setter
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
    public Employee () {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;


    private String name;
    private int salary;

    @Basic
    @Column(name= "NAME")
    public String getName () {return this.name;}
    public void setName(String name) {this.name=name; }

    @Basic
    @Column(name = "SALARY")
    public int getSalary() {return this.salary;}
    public void setSalary(int salary) {this.salary = salary;}


    @OneToMany(mappedBy = "employee")
    private List<Grocery> groceryList;

    @ManyToMany(mappedBy = "employees")
    private List<Shift> shifts;

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) &&
                Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(employeeId, name);
    }


}
