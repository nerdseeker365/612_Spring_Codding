package com.nt.beans;

public class MessageService {
	String message;
	public MessageService() {
		message="i am here ";
		System.out.println("MessageService.MessageService()");
	}
	public MessageService(String msg) {
		message=msg;
	}
	public String getMessage() {
		System.out.println("MessageService.getMessage()");
	return message;
	}

}
