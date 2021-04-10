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
        @NamedQuery(name = "Groceries.findAll", query = "select a from Groceries as a")
})

@Getter@Setter
@Table(name = "Groceries")
public class Groceries implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer GroceryId;

    @Size(max=40)
    @Column(name = "Name")
    private String name;

    @Column(name = "Best Before")
    private Date date;

    @Column(name = "ResponsibleEmployeeID")
    private Integer EmployeeId;
    public Groceries(){

    }

}
