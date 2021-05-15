package lt.vu.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Grocery.findAll", query = "select a from Grocery as a")
})

@Getter@Setter
@Table(name = "Grocery")
public class Grocery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer GroceryId;

    @Size(max=40)
    @Column(name = "Name")
    private String name;

    @Column(name = "BEST_BEFORE")
    private Date date;

    @Column(name = "Employee_ID")
    private Integer EmployeeId;

    @ManyToOne
    private Employee employee;

}
