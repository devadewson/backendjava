package Project1.ECOMERCE.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.bouncycastle.crypto.generators.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import Project1.ECOMERCE.Service.UserService;
import Project1.ECOMERCE.model.User;
import Project1.ECOMERCE.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository  userrepository;
	
	
	@Override
	public List<User> findAll(){
		
		return userrepository.findAll();
	}
	
	@Override
	public String reqUser(User req) {
		String result = "gagal";
		if (req !=null) {
			String pasword = req.getpasword();
		
		BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
		pasword = passEncoder.encode(pasword);
		
		req.setpasword(pasword);
			userrepository.save(req);
		result = "berhasil";
		
		}
		
		return result;
	}
	@Override
	public String updUser(User req) {
		String result = "gagal update data";
		
		Optional<User> optUser = 
				
				userrepository.findById(req.getidUser());
		 
		if(optUser.isPresent()) {
			userrepository.save(req);
			 result = "sukses update program";
		 }
		return result;
	}
	
	@Override
	public String delUser(String id) {
		String result = "berhasil hapus data";
		
		Optional<User> optUser = 
				userrepository.findById(id);
		
		 if(optUser.isPresent()) {
			 userrepository.deleteById(id);
			 result = "sukses hapus data";
		 }
		 
		return result;
	}

	@Override
	public User getUserByusername(String username) {
		
		return userrepository.findByusername(username);
	}

	
	
	

	@Override
	public String regUser(User req) {
		String result = "Failed to register!";
		if(req != null) {
			
			userrepository.save(req);
			result = "Pengguna Berhasil Terdaftar";
		}
		return null;
	}

	
	@Override
	public User getUserByUsername(String username) {
		return userrepository.findByusername(username);
	}
	@Override
	public boolean isPasswordMatch(String username, String pasword) {
		boolean result = false;
		User isUserExists = userrepository.findByusername(username);
		
		if(isUserExists != null) {
			User user = isUserExists;
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			result = encoder.matches(pasword, user.getpasword());
		}
		return result;
	}


}
	



