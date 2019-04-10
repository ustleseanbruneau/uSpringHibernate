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
		user.setCreatedBy("homer");
		user.setEmailAddress("homer.simpson@yahoo.com");
		user.setFirstName("Homer");
		user.setLastName("Simpson");
		user.setLastUpdatedBy("homer");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
