//package com.zee.zee5_app;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import com.zee.zee5_app.dto.EROLE;
//import com.zee.zee5_app.dto.Register;
//import com.zee.zee5_app.dto.Role;
//import com.zee.zee5_app.repository.MovieRepository;
//import com.zee.zee5_app.repository.UserRepository;
//import com.zee.zee5_app.service.RoleService;
//import com.zee.zee5_app.service.UserService;
//
//import java.math.BigDecimal;
//public class Main2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ConfigurableApplicationContext applicationContext=SpringApplication.run(Zee5appspringbootApplication.class,args);
//		
//		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//		Role role = new Role();
//		role.setRoleName(EROLE.ROLE_ADMIN);
//		
//		Role role2 = new Role();
//		role2.setRoleName(EROLE.ROLE_USER); 
//		
//		RoleService roleService = applicationContext.getBean(RoleService.class);
//		
////		System.out.println(roleService.addRole(role));
////		System.out.println(roleService.addRole(role2));
//		
//		UserService service = applicationContext.getBean(UserService.class);
//		Register register;
//		
//		System.out.println(userRepository.existsByEmailAndContactnumber("spidersup@gmail.com",new BigDecimal(923456789)));
//		MovieRepository repository = applicationContext.getBean(MovieRepository.class);
//		System.out.println(repository.findByNameAndLanguage("krish","hindi"));
//		System.out.println(repository.findByName("krish"));
//		System.out.println(repository.findByNameAndDate("krish","27/02/2010"));
//		System.out.println(repository.findByNameAndCast("krish","Hrithik"));
//		
//		applicationContext.close();
//	}
//	
//
//}
