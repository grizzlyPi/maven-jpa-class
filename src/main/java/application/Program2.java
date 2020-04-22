package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Employee;

public class Program2 {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Employee e = em.find(Employee.class, 4);
		
		System.out.println(e);
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}
}