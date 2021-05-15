package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Shift.findAll", query = "select a from Shift as a")
})
@Getter@Setter
@Table(name="Shift")
public class Shift implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ShiftId;

    @Column(name = "Date")
    private Date date;

    @ManyToMany
    private List<Employee> employees;


}
