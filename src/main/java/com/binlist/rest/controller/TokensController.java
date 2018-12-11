package com.binlist.rest.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.binlist.rest.dto.BinlistOut;
import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;

@RestController
public class TokensController {

	public static int INIT = 0;
	public static int END = 6;

	private static final Logger log = LoggerFactory.getLogger(TokensController.class);

	@PostMapping("/tokens")
	public BinlistOut tokenOut(@RequestBody TokenIn tokenIn) {

		String pan = tokenIn.getPan();
		String bin = StringUtils.substring(pan, INIT, END);
		log.info("bin: " + bin);
		
		RestTemplate response = new RestTemplate();
		
		TokenOut tokenOut = new TokenOut(); 

		BinlistOut binlistOut = response.getForObject("https://lookup.binlist.net/56321458", BinlistOut.class);
		
		
		return binlistOut;
	}
}
