package com.wesley.hackerrank_challenges.beecrowd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class URI1001Tests {

	@Test
	void Soma_dado_dois_valores_deve_retornar_a_soma_deles() {
		var x = URI1001.Soma(1, 10);
		assertEquals(11, x);	
	}

}
