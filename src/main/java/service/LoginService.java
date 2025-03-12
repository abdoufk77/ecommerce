package service;

import java.util.Optional;

import dao.IUserDao;
import dao.UserDao;
import entitie.User;

public class LoginService implements ILoginService{

	private IUserDao userDao;
	
	@Override
	public boolean IsUserAuthenticated(String username, String password) {
		
		userDao = new UserDao();
		
		Optional<User> userOptional = userDao.findUser(username, password);
		if(userOptional.isEmpty()) {
			return false;
		}
		
		return true;
		
	}

	
}
