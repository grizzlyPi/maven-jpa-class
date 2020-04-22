package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(null, "Bob Brown", "bobbrown@gmail.com");
		Employee e2 = new Employee(null, "Alex Green", "alexgreen@gmail.com");
		Employee e3 = new Employee(null, "Martha Judge", "marthajudge@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}