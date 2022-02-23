package girish.hib.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import girish.hib.sample.beans.Laptop;
import girish.hib.sample.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Laptop laptop = new Laptop();
      laptop.setLid(101);
      laptop.setLname("Dell");
      
      Student student = new Student();
      student.setName("Girish");
      student.setRollnum(1);
      student.setMarks(50);
      
      SessionFactory sf = HibernateUtil.getSessionFactory();
      Session session= sf.openSession();
      
      session.beginTransaction();
      
      session.save(laptop);
      session.save(student);
      
      session.getTransaction().commit();
    }
}
