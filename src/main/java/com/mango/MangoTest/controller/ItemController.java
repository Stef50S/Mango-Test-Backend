package com.mango.MangoTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mango.MangoTest.model.Item;
import com.mango.MangoTest.repository.ItemRepository;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("/api/")
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	// Getting all the items
	@GetMapping("/{username}/items")
	public List<Item> getAllItems(@PathVariable String username) {
		return itemRepository.findAll();
	}
	
	// Create an item
	@PostMapping("/{username}/items")
	public Item createItem(@RequestBody Item item, @PathVariable String username) {
		return itemRepository.save(item);
	}
}
