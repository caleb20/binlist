package com.binlist.rest.repository.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;
import com.binlist.rest.repository.TokenRepository;
import com.binlist.rest.util.Constant;
import com.binlist.rest.util.Utils;

@Repository
public class TokenRepositoryImpl implements TokenRepository {

	@Value("${url.binlist}")
	private String link;

	@Override
	public Binlist getBinlist(String bin) {
		RestTemplate response = new RestTemplate();
		return response.getForObject(link.concat(bin), Binlist.class);
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
