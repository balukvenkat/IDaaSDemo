/**
 * 
 */
package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author venkat.krishnan
 *
 */
@RestController
public class IDaaSController {
	
	@RequestMapping("/IDaaS")
	public String getUsersList() {
		
		
		return "Greeting from IDaaS!!!";
	}

}
