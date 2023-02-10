package com.example.demo.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepository {
	
	private List<User> userList = new ArrayList<User>();

    public void createUsers() {
		
		userList = List.of(
				new User(1,"User1","Male",new Date(17-06-1999)),
				new User(2,"User2","Female",new Date(04-12-2000)),
				new User(3,"User3","Female",new Date(12-07-1995))
				);
				
    }
		
	public List<User> getAllUsers() {
		    createUsers();
	        return userList;
	    }
		
	}
