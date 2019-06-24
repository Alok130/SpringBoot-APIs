package com.example.demo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class RestApis {

	@Autowired
	private DataAccessLayer dao;
	

	// localhost:8081/allItems
	@GetMapping("/allItems")
	public List<DataModel> getAllItems()
	{
		return dao.findAll();
	}

	// localhost:8081/item/?x=101
	@GetMapping("/item")
	public Optional<DataModel> findByItemno(@RequestParam("x") int id)
	{
		Optional<DataModel> obj = dao.findById(id);
		return obj;
	}
	
	// localhost:8081/delete/?id=77
	@DeleteMapping("/delete")
	public String deleteItem(@RequestParam("id") int del)
	{
		System.out.println(del);
		DataModel obj = dao.getOne(del);
		System.out.println(obj);
		//dao.delete(obj);
		dao.deleteById(del);
		return "Item Deleted Successfully ";
	}
	
	// localhost:8081/updateProduct
	@PutMapping("/updateProduct")
	public DataModel updateItem(@RequestBody DataModel t)
	{
		dao.save(t);
		return t;		
	}
	
	// localhost:8081/additem
	@PostMapping("/additem")
	public DataModel addItem(@RequestBody DataModel t)
	{
		System.out.println(t);
		dao.save(t);
		return t;		
	}
}
