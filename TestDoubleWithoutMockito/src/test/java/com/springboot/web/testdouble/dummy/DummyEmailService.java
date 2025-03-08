package com.springboot.web.testdouble.dummy;

import com.springboot.web.testdouble.dummy.EmailService;

public class DummyEmailService implements EmailService {

	@Override
	public void sendMessage(String message) {
		System.out.println("EMail Service");
		
	}

}
