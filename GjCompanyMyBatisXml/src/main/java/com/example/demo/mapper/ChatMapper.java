package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Chat;

@Mapper
public interface ChatMapper {
	
	// create
	void addChat(Chat c);
	
	
	// read
	List<Chat> selectAll();
	
	@Select("select * from chat")
	List<Chat> allChat();
	
	List<Chat> selectById(int id);
	
//	List<Chat> selectByIdRange(int start, int end);
	List<Chat> selectByIdRange(@Param("start") int start, @Param("end") int end); // 這種寫法比較嚴謹
	
	
	// update
	void updateChat(Chat c);
	
	
	// delete
	void deleteById(int id);
	
}

// 可以共存

