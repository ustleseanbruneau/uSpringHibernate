package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.classic.Session;

import com.infiniteskills.data.entities.User;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		User user = new User();
		
		user.setBirthDate(new Date());
		user.setCreatedDate(new Date());
		user.setCreatedBy("bob");
		user.setEmailAddress("joe.anderson@gmail.com");
		user.setFirstName("Joe");
		user.setLastName("Anderson");
		user.setLastUpdatedBy("homer");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
