package Project1.ECOMERCE.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import Project1.ECOMERCE.model.User;


public interface UserRepository extends JpaRepository<User, String> { 
public User  findByusername(String username);

public User findByIdUser(String idUser);

}
