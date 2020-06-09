package com.okhttp.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/monitor")
public class MonitorController {

	//@Autowired
	//private MonitorServiceImpl monitorService;
	
	@GetMapping
	public ResponseEntity<String> getinfo() throws IOException {
		
		//monitorService.basicCall();
		return ResponseEntity.ok("bla bla");
	}
}
