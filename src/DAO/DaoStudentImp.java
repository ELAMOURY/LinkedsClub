package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//the new imports
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import METIER.Student;
import util.HibernateUtil;




public class DaoStudentImp implements DaoStudent {
	//Attribute
	
	
	//Constructor
	public DaoStudentImp() {}
	
	
	@Override
	public Student add(Student student) {
		
		Session session=HibernateUtil.openSession();
		session.beginTransaction();
		try {
			session.save(student);
		}catch (Exception e) {
			// TODO: handle exception
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
        return student;
	}

}
