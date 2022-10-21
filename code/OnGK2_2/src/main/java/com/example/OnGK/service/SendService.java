package com.example.OnGK.service;


import com.example.OnGK.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class SendService {

	@Autowired
	private JmsTemplate jTemplate;
	
	String topic = "jpa-topic";
	
	public String SendProduct(Subject subject) {
		jTemplate.convertAndSend("ThanhNam", subject);
		return "Send successfull : " + subject.toString();
	}
}
