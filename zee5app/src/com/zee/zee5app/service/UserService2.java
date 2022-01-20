package com.zee.zee5app.service;

import java.util.ArrayList;
import java.util.Optional;

import com.zee.zee5app.dto.Register;

public interface UserService2 {
	public String addUser(Register register);
	public String updateUser(String id, Register register);
	public Optional<Register> getUserById(String id);
	public ArrayList<Register> getAllUsers();
	public String deleteUserById(String id);
}