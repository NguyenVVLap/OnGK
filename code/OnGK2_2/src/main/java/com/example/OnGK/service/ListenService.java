package com.example.OnGK.service;

import com.example.OnGK.model.Subject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Component
public class ListenService {
	
	Subject subject = null;
	 	
	@JmsListener(destination = "ThanhNam")
	public void receive(Subject subject) {
		this.subject = subject;
		System.out.println(subject);
	}
	public Subject receiveProduct() {
		// TODO Auto-generated method stub
		return subject;
	}
} 
