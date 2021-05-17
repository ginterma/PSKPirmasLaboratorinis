package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Employee;
import lt.vu.entities.Shift;
import lt.vu.persistence.ShiftsDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Shifts {
    @Inject
    private ShiftsDAO shiftsDAO;

    @Setter@Getter
    private Shift shiftToCreate = new Shift();

    @Getter
    private List<Shift> shiftsFromDB;

    @PostConstruct
    public void createObject() {this.shiftsFromDB = shiftsDAO.getAllShifts();}

    @Transactional
    public String createShift(){
        this.shiftsDAO.persists(shiftToCreate);
        return "index?faces-redirect=true";
    }
}
