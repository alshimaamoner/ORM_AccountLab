package account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration() .configure("account/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Account account = new Account();
        account.setUserName("Ahmed");
        account.setFullName("AhmedAli");
        account.setPhone("0235355637");
        account.setPassword("1223");
        account.setBirthday(new Date());
        session.beginTransaction();
        session.persist(account);
        session.getTransaction().commit();
        System.out.println("Insertion Done");
    }
}
