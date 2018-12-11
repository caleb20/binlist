package com.binlist.rest.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;
import com.binlist.rest.service.TokenService;
import com.binlist.rest.util.Constant;
import com.binlist.rest.util.Utils;

@Service
public class TokenServiceImpl implements TokenService {

	@Override
	public Binlist getBinlist(String bin) {

		RestTemplate response = new RestTemplate();

		return response.getForObject(Constant.URL_BINLIST.concat(bin), Binlist.class);
	}

	@Override
	public TokenOut getToken(TokenIn tokenIn, String scheme) {

		TokenOut tokenOut = new TokenOut();

		String[] elements = { tokenIn.getPan(), String.valueOf(tokenIn.getExp_year()),
				String.valueOf(tokenIn.getExp_month()) };
		String token = StringUtils.join(elements, '-');

		tokenOut.setToken(Constant.TKN.concat(token));

		tokenOut.setBrand(scheme);
		tokenOut.setCreation_dt(Utils.getDateFormat("yyyy-MM-dd HH:mm:ss"));

		return tokenOut;
	}

}
