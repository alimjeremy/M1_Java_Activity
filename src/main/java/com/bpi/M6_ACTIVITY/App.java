package com.bpi.M6_ACTIVITY;

import com.bpi.M6_ACTIVITY.util.EntityManagerUtil;

import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			testConnection();
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}
	
	//Activity 1 Test Connection
	static void testConnection() {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			if (em.isOpen()) {
				System.out.println("entity manager open, ready to create transaction");
			}

		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}
}
