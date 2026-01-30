package com.bpi.M6_ACTIVITY;

import com.bpi.M6_ACTIVITY.model.Course;
import com.bpi.M6_ACTIVITY.model.Student;
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
			persistenOneToMany(em);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}

	// Activity 1 Test Connection
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

	// Activity 2 Insert Student name in Students tables
	static void runM6Activity2(EntityManager em) {
		try {
			em.getTransaction().begin();

			Student newStudent = new Student();
			newStudent.setName("Julie Ann Capispisan");
			newStudent.setAge(35);
			newStudent.setEmail("julieanncapispisan@gmail.com");

			em.persist(newStudent);
			em.getTransaction().commit();

		} finally {

		}

	}
	
	static void persistenOneToMany(EntityManager em) {
		em.getTransaction().begin();
		
		Student student1 = em.find(Student.class, 3L);
		
		Course newCourse = new Course();
		newCourse.setCourseName("Filipino");
		newCourse.setGrade(89.67);
		newCourse.setStudent(student1);
		
		em.persist(newCourse);
		
		em.getTransaction().commit();
	}
}
