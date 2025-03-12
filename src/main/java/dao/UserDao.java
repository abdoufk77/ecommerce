package dao;

import java.util.Optional;

import javax.persistence.EntityManager;

import entitie.User;
import util.JpaUtil;

public class UserDao implements IUserDao{
	
	EntityManager entityManager = JpaUtil.getEntityManager();

	@Override
	public Optional<User> findUser(String email, String password) {
		
		try {
			User user = entityManager.createQuery(
					"select u from User u where u.email =: email and u.password =: password",User.class)
					.setParameter("email",email)
					.setParameter("password", password)
					.getSingleResult();
			
			return Optional.of(user);
			
		} catch (Exception e) {
			return Optional.empty();
		}
		
	}

	@Override
	public void addUser(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		
	}	
}
