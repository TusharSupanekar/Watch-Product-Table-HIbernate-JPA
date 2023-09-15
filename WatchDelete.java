package com.jsp.watches;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class WatchDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");
		
		EntityManager entityManager =
				entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =
				entityManager.getTransaction();

		Watch watch = entityManager.find(Watch.class, 8);
		if (watch != null) {
			entityTransaction.begin();
			entityManager.remove(watch);
			entityTransaction.commit();
		} else {
			System.out.println("Not deleted");
		}
	}

}
