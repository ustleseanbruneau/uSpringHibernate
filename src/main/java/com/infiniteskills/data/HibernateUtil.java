package com.infiniteskills.data;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			//Configuration configuration = new Configuration().configure();
			
			//builds a session factory from the service registry
			//sessionFactory = configuration.configure().buildSessionFactory();
			
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		}
		
		return sessionFactory;
	}

	
	//private static final SessionFactory sessionFactory = buildSessionFactory();
	
	//private static ServiceRegistry serviceRegistry;
	
	
	//private static SessionFactory buildSessionFactory() {
		//try {
			//Configuration configuration = new Configuration();
			//configuration.addAnnotatedClass(User.class);
			//return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
			
			
		//} catch (Exception e) {
			//e.printStackTrace();
			//throw new RuntimeException("There was an error building the factory");
		//}
		//return null;
	//}
	
	//public static SessionFactory getSessionFactory() {
		//return sessionFactory;
	//}

}
