package com.pocs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

	@Autowired
    Greeting helloWorld;
 
    @RequestMapping("/")
    public String home() {
        return helloWorld.greet();
    }
}

/*Dependency injection: An interface is put into place because a greeting can be anything. 
 * in this case hello world, if another greeting is to be supplied a new class
 * can implement the greeting interface.
 * 
 * if you have more than one @Service, you will need to add a configuration class
*/ 