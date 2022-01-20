
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
package com.zee.zee5app;

import java.security.Provider.Service;
import java.util.Optional;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.service.UserService2;
import com.zee.zee5app.service.Impl.UserServiceImpl;

import com.zee.zee5app.exception.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method added 
		Register register=new Register();
		
		try {
			Register register4=new Register("abba13","Shrushti1","Hegde1","shrush@gmail.com","shrush1");
		} catch (InvalidIdException | InvalidNameException | InvalidEmailException | InvalidPasswordException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}
		
		try {
			Register register5=new Register("abba14","Shrushti2","Hegde2","shrush2@gmail.com","shrush2");
		} catch (InvalidIdException | InvalidNameException | InvalidEmailException | InvalidPasswordException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace(); 
		}


		try {
			register.setFirstName("Shrushti");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			register.setEmail("shrush@gmail.com");
		} catch (InvalidEmailException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			register.setLastName("Hegde");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(register);		
		UserService2 userservice=UserServiceImpl.getInstance();
		Register register1=new Register();
		
		
		try {
			register1.setId("abba14");
		} catch (InvalidIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			register1.setEmail("aba14"+"@gmail.com");
		} catch (InvalidEmailException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			register1.setFirstName("Shrushti14");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			register1.setLastName("Hegde14");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			register1.setPassword("shrushti14");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(userservice.addUser(register1));
		for(Register register3:userservice.getAllUsers())
			System.out.println(register3);
		
		for(int i=0;i<20;i++)
		{
			Register register2=new Register();
			try {
				register2.setId("abbba"+i);
				register2.setEmail("abbba"+i+"@gmail.com");
				register2.setFirstName("shru"+i);
				register2.setLastName("heg"+i);
				register2.setPassword("Shrushti"+i);
			} catch (InvalidIdException | InvalidEmailException | InvalidNameException | InvalidPasswordException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userservice.addUser(register2);
		}
		Optional<Register> optional=userservice.getUserById("abbba14");
		if (optional.isPresent()) {
			System.out.println("user is "+optional.get());
		}
		else
			System.out.println("id not found");
	}

}