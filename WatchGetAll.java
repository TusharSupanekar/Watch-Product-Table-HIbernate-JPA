package com.jsp.watches;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class WatchGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("tushar");

		EntityManager entityManager =
				entityManagerFactory.createEntityManager();

		String sql = "SELECT e FROM Watch e";
		Query query = entityManager.createQuery(sql);
		
		List<Watch> watch = query.getResultList();
		for (Watch e : watch) {
			System.out.println("===============");
			System.out.println(e.getId());
			System.out.println(e.getBrand());
			System.out.println(e.getPrice());
			System.out.println("===============");
	}
	}
	}


