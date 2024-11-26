package com.example.foodordering.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foodordering.dto.LoginDTO;
import com.example.foodordering.dto.PasswordDTO;
import com.example.foodordering.dto.UserDTO;
import com.example.foodordering.model.Login;
import com.example.foodordering.model.User;


@Service
public interface UserService {
	
	List<UserDTO> findAllUsers();
	List<UserDTO> findAllEmployees();
	
	User findOne(Long id);
	User findByUsername(String username);
	User delete(User user);
	User getCurrentUser();
	String validateUser(User user);
	String validateUserUpdate(UserDTO user);
	String validateEmployeeUpdate(User user);
	String updateUser(UserDTO userDTO);
	String updateEmployee(User user);
	LoginDTO generateToken(Login login); 
	String isValidLogout();
	String deactivateUser(Long id);
	String saveUser(User user);
	String saveEmployee(User user);
	public void setCurrentUser(User user);
	String changePassword(PasswordDTO passwordDTO);

}
