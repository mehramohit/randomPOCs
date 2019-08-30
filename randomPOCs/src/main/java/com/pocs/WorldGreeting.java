package com.pocs;

import org.springframework.stereotype.Service;

@Service
public class WorldGreeting implements Greeting{

	public String greet() {

		return "Hello World";
	}

	
}
