package com.jsp.watches;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class WatchGetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");
		
		EntityManager entityManager =
				entityManagerFactory.createEntityManager();
		
		Watch watch=entityManager.find(Watch.class, 5);
		System.out.println(watch.getId());
		System.out.println(watch.getBrand());
		System.out.println(watch.getPrice());


	}

}
