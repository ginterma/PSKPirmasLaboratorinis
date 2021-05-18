package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mybatis.dao.ShiftMapper;
import lt.vu.mybatis.model.Shift;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
@Model
public class ShiftsMyBatis {
    @Inject
    private ShiftMapper shiftMapper;

    @Getter
    List<Shift> allShifts;

    @Getter@Setter
    private Shift shiftToCreate = new Shift();

    @PostConstruct
    public void init(){this.getShiftsFromDB();}

    public void getShiftsFromDB(){this.allShifts = shiftMapper.selectAll();}

    @Transactional
    public String createShift(){
        shiftMapper.insert(shiftToCreate);
        return "EmployeeDetails?faces-redirect=true";
    }
}
