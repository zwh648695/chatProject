package com.example.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Chat;

@SpringBootTest
public class ChatMapperTest {
	
	@Autowired
	ChatMapper chatmapper;
	
//	@Test
	public void addChatTest()
	{
		chatmapper.addChat(new Chat("cc","cc","cc"));
		
		System.out.println("success");
	}
	
//	@Test
	public void selectAllTest()
	{
		System.out.println(chatmapper.selectAll());
	}
	
//	@Test
	public void allChatTest()
	{
		System.out.println(chatmapper.allChat());
	}
	
//	@Test
	public void selectByIdTest()
	{
		System.out.println(chatmapper.selectById(2));
	}
	
//	@Test
	public void selectByIdRangeTest()
	{
		System.out.println(chatmapper.selectByIdRange(1, 2));
	}
	
//	@Test
	public void updateChatTest()
	{
		Chat c = chatmapper.selectById(2).get(0);
		c.setName("bb");
		
		chatmapper.updateChat(c);
		
		System.out.println("success");
	}
	
	@Test
	public void deleteByIdTest()
	{
		chatmapper.deleteById(14);
		
		System.out.println("success");
	}

}
