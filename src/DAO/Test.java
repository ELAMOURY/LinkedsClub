package DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import METIER.Student;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student student =new Student("m1256885","zakaria","zaml","sqjdhqsgd","qsdqsdq","sdfsdf","ddddddd","sdkjsdjfgs","imammamamam","qsydgyqlsgf");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		    
	}

}
