package lt.vu.persistence;

import lt.vu.entities.Shift;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ShiftsDAO {
    @Inject
    private EntityManager entityManager;

    public void setEntityManager (EntityManager em) {this.entityManager = em;}

    public List<Shift> getAllShifts(){

        return entityManager.createNamedQuery("Shift.findAll", Shift.class).getResultList();
    }
    public void persists (Shift shift) {this.entityManager.persist(shift);}

    public Shift findShiftById (Integer id) {return entityManager.find(Shift.class, id);}

    public Shift updateShift(Shift shift) {return entityManager.merge(shift);}
}
