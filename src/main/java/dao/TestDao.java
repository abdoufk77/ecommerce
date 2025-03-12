package dao;

import entitie.User;

public class TestDao {
	public static void main(String[] args) {
		User user = new User("foukahy","abdou","abdou@gmail.com","0000","admin");
		new UserDao().addUser(user);
	}
}
