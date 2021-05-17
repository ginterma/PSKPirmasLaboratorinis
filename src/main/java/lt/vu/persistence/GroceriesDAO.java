package lt.vu.persistence;

import lt.vu.entities.Grocery;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class GroceriesDAO {

    @Inject
    private EntityManager entityManager;

    public void setEntityManager (EntityManager em) {this.entityManager = em;}

    public List<Grocery> getAllGroceries(){

        return entityManager.createNamedQuery("Grocery.findAll", Grocery.class).getResultList();
    }
    public void persists (Grocery grocery) {this.entityManager.persist(grocery);}

    public Grocery findGroceriesById (Integer id) {return entityManager.find(Grocery.class, id);}

    public Grocery updateEmployee(Grocery grocery) {return entityManager.merge(grocery);}

    public void removes (Grocery grocery) {this.entityManager.remove(grocery);}
}
