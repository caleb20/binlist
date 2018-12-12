package com.binlist.rest.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.repository.TokenRepository;
import com.binlist.rest.service.impl.TokenServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TokenServiceImplTest {

	@InjectMocks
	TokenServiceImpl tokenServiceImpl;

	@Mock
	TokenRepository tokenRepository;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TokenTest() throws Exception {
		
		TokenIn tokenIn = new TokenIn();
		tokenIn.setPan("4444333322221111");
		tokenIn.setExp_year(2020);
		tokenIn.setExp_month(10);
		String scheme = "visa";

		TokenOut tokenOut = new TokenOut();
		tokenOut.setToken("tkn_live_4444333322221111-2020-10");
		tokenOut.setBrand("visa");
		tokenOut.setCreation_dt("2018-12-12 10:13:45");

		Mockito.when(tokenRepository.getToken(Mockito.any(TokenIn.class), Mockito.eq(scheme))).thenReturn(tokenOut);
		tokenServiceImpl.getToken(tokenIn, scheme);
		Mockito.verify(tokenRepository).getToken(Mockito.any(TokenIn.class), Mockito.eq(scheme));

	}
}
