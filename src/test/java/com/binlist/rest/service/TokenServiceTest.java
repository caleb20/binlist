package com.binlist.rest.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TokenServiceTest {

	@Autowired
	TokenService tokenService;

	private TokenIn tokenIn = new TokenIn();
	private String scheme;

	@Before
	public void init() {
		tokenIn.setPan("4444333322221111");
		tokenIn.setExp_year(2020);
		tokenIn.setExp_month(10);
		scheme = "444433";
		
	}

	@Test
	public void TokenServiceIntegrationtest() {
		TokenOut tokenOut = tokenService.getToken(tokenIn, scheme);
		assertNotNull(tokenOut);
	}
}
