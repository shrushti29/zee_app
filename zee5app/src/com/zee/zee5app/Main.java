package com.zee.zee5app;
//
//import java.util.Iterator;
//
//import com.zee.zee5app.dto.Register;
//import com.zee.zee5app.service.UserService;
//import com.zee.zee5app.repository.*;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Register register = new Register();
//		//Register : class name
//		// register : reference which will refer your object
//		// new : is used to create the object 
//		// Register() : constructor ===> DC ==> IDC
//		
//		register.setFirstName("shrushti");
//		register.setLastName("hegde");
//		register.setEmail("shrush@gmail.com");
//		register.setPassword("1234");
//		
//		System.out.println(register);
//		// whenever you will print the reference then it 
//		// will call toString() method.
//		
//		System.out.println(register.toString());
//	
//		System.out.println(register.getEmail());
//		
//		// can u create the login object?
//		// then can u print the login detials?
//		
//		UserService service = UserService.getInstance();
//		
//		for(int i=1;i<=20;i++) {
//		
//			Register register2 = new Register();
//			register2.setId("ab00"+i);
//			register2.setFirstName("shrushti"+i);
//			register2.setLastName("hegde"+i);
//			register2.setPassword("shrushti");
//			String result = service.addUser(register2);
//			System.out.println(result);
//		}
//		
//	
//		
//		
//		// userservice object
//		// main is consuming the service ?
//		
//		Register register2 = service.getUserById("ab1");
//		System.out.println(register2!=null);
//		
//		for (Register register3 : service.getUsers()) {
//			if(register3!=null)
//			System.out.println(register3);
//		}
//		
//		UserRepository repository =null;
//	}
//
//}

import java.security.Provider.Service;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.UserService2;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.Impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method added 
		Register register=new Register();
		register.setFirstName("Shrushti");
		register.setEmail("shrushti@gmail.com");
		register.setLastName("Hegde");
		System.out.println(register);
		Login login=new Login();
		UserService service=UserService.getInstance();
		for(int i=0;i<12;i++)
		{
			Register register1=new Register();
			register1.setId("abba"+i);
			register1.setEmail("aba"+i+"@gmail.com");
			register1.setFirstName("Shrushti"+i);
			register1.setLastName("Hegde");
			register1.setPassword("	Shrushti"+i);
			String res=service.addUser(register1);
//			System.out.println(res);
		}
		System.out.println(service.getUserById("abba2")!=null);
		for(Register register3:service.getAllUsers())
			System.out.println(register3);
		System.out.println(service.deleteUser("abba2"));
		for(Register register3:service.getAllUsers())
			System.out.println(register3);
		SubscriptionService subscriptionservice=SubscriptionService.getInstance();
		MovieService movieservice=MovieService.getInstance();
		SeriesService seriesservice=SeriesService.getInstance();
		UserService2 userservice=UserServiceImpl.getInstance();
		Register register1=new Register();
		register1.setId("abba14");
		register1.setEmail("aba14"+"@gmail.com");
		register1.setFirstName("Shrush");
		register1.setLastName("Shrush");
		register1.setPassword("Shrush");
		System.out.println(userservice.addUser(register1));
		for(Register register3:userservice.getAllUsers())
			System.out.println(register3);
	}

}