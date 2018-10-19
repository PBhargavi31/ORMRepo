

	package com.verizon.jhd.ui;

	import java.time.LocalDate;
	import java.util.Date;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityTransaction;

import com.verizon.jhd.model.Address;
import com.verizon.jhd.model.Employee;
import com.verizon.jhd.model.Gender;
	import com.verizon.jhd.model.Person;
	import com.verizon.jhd.util.JPAUtil;

	public class App03 {

		public static void main(String args[]) {
			Employee e = new Employee("Bhargavi", Gender.Faminine,LocalDate.of(1996, 10, 31),new Address("34-31-150","Hyderabad","AP"));
			EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
			EntityTransaction txn = em.getTransaction();
			
			txn.begin();
			em.persist(e);
			
			
			txn.commit();

			System.out.println("Data persisted");
			JPAUtil.shutdown();

		}
		
}
