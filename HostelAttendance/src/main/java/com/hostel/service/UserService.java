
package com.hostel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.model.Students;
import com.hostel.model.User;
import com.hostel.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public User saveUser(User u) {
		return userRepo.save(u);
	}
	public User addStudent(User students) {
		// TODO Auto-generated method stub
		return userRepo.save(students);
	}

	public String validateUser(String username, String password) {
		String result = "";
		User u = userRepo.findByUsername(username);
		if (u == null) {
			result = "Invalid user";
		} else {
			if (u.getPassword().equals(password)) {
				result = "Login success";
			} else {
				result = "Login failed";
			}
		}

		return result;
	}

}




