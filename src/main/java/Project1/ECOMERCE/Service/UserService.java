package Project1.ECOMERCE.Service;

import java.util.List;



import Project1.ECOMERCE.model.User;

public interface UserService {
public List<User> findAll();
	
	public String reqUser(User req);
	
	public String updUser(User req);
	
	public String delUser(String id);
	
	public User getUserByusername(String nama);
	
	public User getUserByUsername(String username);
	
	public boolean isPasswordMatch(String username, String pasword);
	
	public String regUser(User req) ;
}


