package org.suzipats.controller;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.suzipats.Greeting;

@RestController
public class GreetingController {

	private static Logger logger = LoggerFactory.getLogger(GreetingController.class);
	private static final String template = "Hello, %s! Current time is %s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value="/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("greeting called..."+counter.incrementAndGet());
		return new Greeting(counter.get(), String.format(template, name, LocalDateTime.now().toString()));
	}
}
