package com.hs.control;

import org.hibernate.Session;

import com.hs.database.HibernateUtilities;
import com.hs.model.Events;

public class Program {

	public static void main(String[] args) {
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Events event = new Events();
		event.setEvent_id(12);
		session.save(event);
		
		session.getTransaction().commit();
		
		session.close();
		HibernateUtilities.getSessionFactory().close();

	}

}

