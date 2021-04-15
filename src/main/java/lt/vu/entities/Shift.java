package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@NamedQueries({
        @NamedQuery(name = "Shifts.findAll", query = "select a from Shift as a")
})
@Getter@Setter
@Table(name="Shifts")
public class Shift implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ShiftId;

    @Column(name = "Date")
    private Date date;


}
