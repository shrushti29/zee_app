package com.zee.zee5_app;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.dto.Role;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.repository.RoleRepository;
import com.zee.zee5_app.service.UserService;

@SpringBootApplication
public class TestUserApplication {

	public static void main(String[] args) throws AlreadyExistsException {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(TestUserApplication.class, args);
		
		UserService userService = applicationContext.getBean(UserService.class);
		RoleRepository roleRepository = applicationContext.getBean(RoleRepository.class);
		System.out.println("Add User");
		for (int i = 1; i <= 5; i++) {
			Register register = new Register("reg000"+i, "Shrushti"+i, "Hegde"+i, "shrushti"+i+"@gmail.com", "shrush123"+i, new BigInteger("990257389"+i), null, null);
			Set<Role> roles = new HashSet<Role>();
			roles.add(roleRepository.findById(1).get());
			roles.add(roleRepository.findById(2).get());
			register.setRoles(roles);
			System.out.println(userService.addUser(register) + " " + i);
		}
		System.out.println();
		
//		System.out.println("Get User by Id");
//		System.out.println(userService.getUserById("reg0004").get());
//		System.out.println();
//		
//		System.out.println("Get All User Details - List");
//		userService.getAllUserDetails().get().forEach(e->System.out.println(e));
//		System.out.println();
//		
//		System.out.println("Delete Record by Id");
//		try {
//			System.out.println(userService.deleteUserById("reg0003"));
//		} catch (IdNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println();
//		
//		System.out.println("Get All User Details - Array");
//		for (Register register : userService.getAllUsers()) {
//			System.out.println(register);
//		}
//		System.out.println();
		
		applicationContext.close();
	}

}