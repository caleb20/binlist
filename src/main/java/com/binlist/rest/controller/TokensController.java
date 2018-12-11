package com.binlist.rest.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;
import com.binlist.rest.service.TokenService;
import com.binlist.rest.util.Constant;

@RestController
public class TokensController {

	private static final Logger log = LoggerFactory.getLogger(TokensController.class);

	@Autowired
	TokenService tokenService;

	@PostMapping("/tokens")
	public TokenOut tokenOut(@RequestBody TokenIn tokenIn) {

		String bin = StringUtils.substring(tokenIn.getPan(), Constant.START, Constant.END);
		log.info("bin: " + bin);

		Binlist binlistOut = tokenService.getBinlist(bin);
		log.info("binlistOut: " + binlistOut);

		TokenOut tokenOut = tokenService.getToken(tokenIn, binlistOut.getScheme());
		log.info("tokenOut: " + tokenOut);

		return tokenOut;
	}
}
