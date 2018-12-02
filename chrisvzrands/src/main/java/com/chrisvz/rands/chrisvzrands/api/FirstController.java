package com.chrisvz.rands.chrisvzrands.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class FirstController {
	
	@GetMapping("/item")
	public String getme() {
		return "weee";
	}

}
