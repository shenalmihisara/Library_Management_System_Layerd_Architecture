package repository;

import DB.HibernateUtil;
import model.LoginEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class LoginRepository {
    Session session = HibernateUtil.getSession();

    public LoginEntity checkLo0ginDetails(String userName, String password){
        String HQL = "FROM LoginEntity WHERE userName = :userName AND password = :password";

        LoginEntity loginEntity = session.createQuery(HQL, LoginEntity.class)
                .setParameter("userName", userName)
                .setParameter("password", password)
                .uniqueResult();

        return loginEntity;
    }
}
