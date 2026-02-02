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
			m6Activity4Solution(em);
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
	
	// Activity 3 ManyToOne and OneToMany Relation
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
	
	// Activity 4 CRUD
	static void m6Activity4Solution(EntityManager em) {
		em.getTransaction().begin();
		
		Student newStudent = new Student();
		
		newStudent.setName("Jill Valentine");
		newStudent.setAge(24);
		newStudent.setEmail("jillvalentine@gmail.com");
		
		em.persist(newStudent);
		
		em.flush();
		
		em.detach(newStudent);
		
		System.out.println("is newStudent inside the persistence context: " + em.contains(newStudent));
		
		newStudent = em.merge(newStudent);
		
		newStudent.setAge(26);
		
		em.flush();
		
		System.out.println("is newStudent inside the persistence context: " + em.contains(newStudent));
		
		em.remove(newStudent);
		
		em.flush();
		
		System.out.println("is newStudent inside the persistence context: " + em.contains(newStudent));
		
		em.getTransaction().commit();
	}
}
