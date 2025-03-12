package service;

public interface ILoginService {

	boolean IsUserAuthenticated(String email, String password);

}
