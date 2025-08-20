package com.chat.application.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.application.model.ChatMessage;

@Controller
public class ChatApplicationController {
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public ChatMessage sendMessage(ChatMessage message) {
		return message;
	}
	
	@GetMapping("chat")
	public String chat() {
		return "chat";
	
	}
}
