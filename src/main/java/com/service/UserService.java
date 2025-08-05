package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
	List<User> list = new ArrayList<User>();

	public void addUser(User user) {
		list.add(user);
	}

	public List<User> loadAll() {
		return list;
	}
	public boolean searchUser(String uname) {
		for (User us : list) {
			if (us.getUserName().equals(uname)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(String uname) {
		for (User us : list) {
			if (us.getUserName().equals(uname)) {
				list.remove(us);
				return true;
			}
		}
		return false;
	}

	public boolean findUser(String uname, String pass) {
		for (User us : list) {
			if (us.getUserName().equals(uname) && us.getPassword().equals(pass)) {
				return true;
			}
		}
		return false;
	}
	public boolean updateUser(String uname,User user) {
		for (User us : list) {
			if (us.getUserName().equals(uname)) {
				 us.setUserName(user.getUserName());
				 us.setPassword(user.getPassword());
				 us.setEmail(user.getEmail());
				 us.setCity(user.getCity());
				 return true;
			 
			}
		}
		return false;
		 
	}
}
