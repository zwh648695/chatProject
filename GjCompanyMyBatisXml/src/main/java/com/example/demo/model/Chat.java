package com.example.demo.model;

import lombok.Data;

@Data
public class Chat {

	private Integer id;
	private String name;
	private String subject;
	private String content;

	public Chat() {

	}

	public Chat(String name, String subject, String content) {
		this.name = name;
		this.subject = subject;
		this.content = content;
	}

}
