package br.cin.ufpe.if1007.lecture03.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class SupportBeans {

	@Bean
	public AtomicLong atomicLong() {
		return new AtomicLong();
	}
}
