package com.binlist.rest.repository;

import com.binlist.rest.dto.TokenIn;
import com.binlist.rest.dto.TokenOut;
import com.binlist.rest.dto.card.Binlist;

public interface TokenRepository {
	
	public Binlist getBinlist(final String bin);
	public TokenOut getToken(final TokenIn tokenIn, final String scheme);

}
