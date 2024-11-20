package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ChatMapper;
import com.example.demo.model.Chat;
import com.example.demo.service.ChatService;

@Service
public class ChatServiceImpl implements ChatService {
	
	@Autowired
	ChatMapper chatmapper;

	@Override
	public void AddChat(Chat c) {
		
		chatmapper.addChat(c);
		
	}

	@Override
	public List<Chat> AllChat() {
		
		return chatmapper.selectAll();
		
	}

	@Override
	public void UpdateChat(Chat c) {
		
		Chat chat = chatmapper.selectById(c.getId()).get(0);
		
	    if(c.getSubject() != null)
	    {
	        chat.setSubject(c.getSubject());
	    }
	    if(c.getContent() != null)
	    {
	        chat.setContent(c.getContent());
	    }
		
		chatmapper.updateChat(chat);
		
	}

	@Override
	public void DeleteChat(int id) {
		
		chatmapper.deleteById(id);
		
	}

}
