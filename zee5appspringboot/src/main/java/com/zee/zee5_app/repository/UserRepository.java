package com.zee.zee5_app.repository;

//import java.math.BigDecimal;
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.zee.zee5_app.dto.Register;
//@Repository
//public interface UserRepository extends JpaRepository<Register, String> {
////custom jpa method, we wont write any definition just signature
//	//Boolean existsByEmail(String email);
//	//Boolean existsByContact(BigDecimal contactNumber);
//	Boolean existsByEmailAndContactnumber(String email, BigDecimal contactNumber);
//}

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee.zee5_app.dto.Register;

@Repository
public interface UserRepository extends JpaRepository<Register, String> {
	
	Boolean existsByEmailAndContactNumber(String email, BigInteger contactNumber);

}