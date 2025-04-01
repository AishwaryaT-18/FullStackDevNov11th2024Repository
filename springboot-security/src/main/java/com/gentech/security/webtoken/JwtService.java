package com.gentech.security.webtoken;

import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
@Service
public class JwtService {
	private static final String secret="495FC8DF4EFB4A70F112356DE41AAE508873968C496F89FE354A5693AD824A8F909D604577E13BC20EF00946458657EB3AC47917AB892E1967E153BD3B2535E4";
    private static final long validity=TimeUnit.MINUTES.toMillis(30);
	
	public String generateToken(UserDetails userDetails)
	{
		Map<String,String> claims=new HashMap<>();
		claims.put("issuer", "http://www.gentechacademy.com");
		return Jwts.builder()
		.claims(claims)
		.subject(userDetails.getUsername())
		.issuedAt(Date.from(Instant.now()))
		.expiration(Date.from(Instant.now().plusMillis(validity)))
		.signWith(generateKey())
		.compact();
	}
	
	public SecretKey generateKey()
	{
		byte[] decodedKey=Base64.getDecoder().decode(secret);
		return Keys.hmacShaKeyFor(decodedKey);
	}

	public String extractUser(String jwt) {
		Claims claims=Jwts.parser()
				.verifyWith(generateKey())
				.build()
				.parseSignedClaims(jwt)
				.getPayload();
			return claims.getSubject();
		
	}

	public boolean isTokenValid(String jwt) {
		Claims claims=Jwts.parser()
				.verifyWith(generateKey())
				.build()
				.parseSignedClaims(jwt)
				.getPayload();
		return claims.getExpiration().after(Date.from(Instant.now()));
	}
}
