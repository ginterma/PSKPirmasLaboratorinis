package lt.vu.persistence;

import lt.vu.entities.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class EmployeeDAO {

        @Inject
        private EntityManager entityManager;

        public void setEntityManager (EntityManager em) {this.entityManager = em;}

        public List<Employee> getAllEmployees(){

            return entityManager.createNamedQuery("Employee.findAll", Employee.class).getResultList();
        }
        public void persists (Employee employee) {this.entityManager.persist(employee);}

        public Employee findEmployeeById (Integer id) {return entityManager.find(Employee.class, id);}

        public Employee updateEmployee(Employee employee) {return entityManager.merge(employee);}

}
