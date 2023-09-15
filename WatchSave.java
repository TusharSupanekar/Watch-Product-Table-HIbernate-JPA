package com.jsp.watches;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WatchSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tushar");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Watch watch=new Watch();
		watch.setBrand("Chinese");
		watch.setPrice(150.00);
		
		entityTransaction.begin();
		entityManager.persist(watch);
		entityTransaction.commit();

	}

}
