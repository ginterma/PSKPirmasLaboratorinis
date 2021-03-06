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

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer GroceryId;

    @Size(max=40)
    @Column(name = "Name")
    private String name;

    @Column(name = "BEST_BEFORE")
    private String date;


    @ManyToOne
    private Employee employee;

}
