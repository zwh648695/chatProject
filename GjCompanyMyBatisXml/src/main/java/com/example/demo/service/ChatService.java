package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Chat;

public interface ChatService {
	
	// create
	void AddChat(Chat c);
	
	
	// read
	List<Chat> AllChat();
	
	
	// update
	void UpdateChat(Chat c);
	
	
	// delete
	void DeleteChat(int id);

}
