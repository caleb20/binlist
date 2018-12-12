package com.binlist.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;
import com.binlist.rest.service.TokenService;

@RestController
public class TokensController {

	private static final Logger LOGGER = Logger.getLogger(TokensController.class);

	@Autowired
	TokenService tokenService;

	@PostMapping("/tokens")
	public TokenOut tokenOut(@RequestBody TokenIn tokenIn) {

		LOGGER.info("Obtener Token");

		Binlist binlistOut = tokenService.getBinlist(tokenIn.getPan());

		return tokenService.getToken(tokenIn, binlistOut.getScheme());
	}
}
