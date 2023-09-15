package com.jsp.watches;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WatchUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");
		
		EntityManager entityManager =
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =
				entityManager.getTransaction();
		
		Watch watch=entityManager.find(Watch.class, 6);
		watch.setBrand("Seiko");
		
		entityTransaction.begin();
		entityManager.merge(watch);
		entityTransaction.commit();

	}

}
