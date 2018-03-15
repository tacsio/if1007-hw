package br.cin.ufpe.if1007.lecture03.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

	@Value("${msg.template}")
	private String msgTemplate;

	@Autowired
	private AtomicLong atomicLong;

	@GetMapping("/greeting")
	public Greeting hello(@RequestParam(value = "name", defaultValue = "Poarr!!") String name) {
		return new Greeting(atomicLong.incrementAndGet(),String.format(msgTemplate, name));
	}
}

@Data
@AllArgsConstructor
class Greeting {
	private long id;
	private String content;
}
