 package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
@Service
public class ProductService {

	@Autowired
	UserRepo repositorylayer;
	public List<User> show()
	{
		return repositorylayer.findAll();
	}
	public User postDetails(User modify)
	{
		return repositorylayer.save(modify);
	}
	public void putDetails(User name)
	{
		repositorylayer.saveAndFlush(name);
	}
	public void delete(Integer id)
	{
		repositorylayer.deleteById(id);
	}
	public void deletedirect(User st)
	{
		repositorylayer.delete(st);
	}
	public User get(Integer id)
	{
		return repositorylayer.findById(id).get();
	}

	
}

	