package DB;

import model.LoginEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static Session getSession(){

        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(LoginEntity.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        return sessionFactory.openSession();
    }
}
