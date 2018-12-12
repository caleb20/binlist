package com.binlist.rest.service;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;

public interface TokenService {

	public Binlist getBinlist(String bin);
	public TokenOut getToken(TokenIn tokenIn, String scheme);

}
