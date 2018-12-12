package com.binlist.rest.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;
import com.binlist.rest.repository.TokenRepository;
import com.binlist.rest.service.TokenService;
import com.binlist.rest.util.Constant;

@Service
public class TokenServiceImpl implements TokenService {

	private static final Logger LOGGER = Logger.getLogger(TokenServiceImpl.class);

	@Autowired
	TokenRepository tokenRepository;

	@Override
	public Binlist getBinlist(String pan) {

		LOGGER.info("PAN : [" + pan + "]");

		String bin = StringUtils.substring(pan, Constant.START, Constant.END);
		
		Binlist binlist = tokenRepository.getBinlist(bin);

		LOGGER.debug("BINLIST : [" + binlist + "]");

		return binlist;
	}

	@Override
	public TokenOut getToken(TokenIn tokenIn, String scheme) {

		LOGGER.info("TOKENIN : [" + tokenIn + "]");
		LOGGER.info("SCHEME : [" + scheme + "]");
		
		TokenOut tokenOut = tokenRepository.getToken(tokenIn, scheme);

		LOGGER.debug("TOKENOUT : [" + tokenOut + "]");

		return tokenOut;
	}

}
