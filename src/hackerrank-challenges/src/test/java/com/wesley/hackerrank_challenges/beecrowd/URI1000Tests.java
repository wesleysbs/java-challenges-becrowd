package com.wesley.hackerrank_challenges.beecrowd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class URI1000Tests {

	@Test
	void HelloWorld_deve_retornar_uma_string_com_sucesso() {
		var x = URI1000.HelloWorld();
		assertEquals("Hello World", x);			
	}

}
