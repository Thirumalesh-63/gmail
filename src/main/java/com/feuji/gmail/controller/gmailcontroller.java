package com.feuji.gmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cmail")
public class gmailcontroller {

	//write javamailsender object and autowire it
	//write a method to send the mail

	@Autowired
	private JavaMailSender javaMailSender;
	
	@PostMapping("/sendmail")
	public void sendmail() {
		//genrate the simplemailmessage object
		SimpleMailMessage message=new SimpleMailMessage();
		System.out.println("=++++++++++++++++++++++++");
		message.setFrom("gt121603@gmail.com");
	    message.setTo("gtm5562@gmail.com");
        message.setSubject("Testing from Spring Boot");
        message.setText("Hello World \n Spring Boot Email");
        javaMailSender.send(message);
	}
}
