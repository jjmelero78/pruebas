package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	 //public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	  @RequestMapping(value = "/pruebas/{id}", method = RequestMethod.GET)
	    public String pruebas(@PathVariable("id") String id) {
	     //   logger.info("Fetching User with id {}", id);
	       
	        return "Hola pruebas";
	    }
}
