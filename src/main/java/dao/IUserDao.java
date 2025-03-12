package dao;

import java.util.Optional;

import entitie.User;

public interface IUserDao {
	Optional<User> findUser(String username , String password);
	void addUser(User user);
}
