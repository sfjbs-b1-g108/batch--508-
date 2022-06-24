package com.Mini_Project_Authentication;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationConverter;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;
/*public class JwtAuthenticationFilter1 extends AuthenticationFilter {
	

	
	
	public JwtAuthenticationFilter1(AuthenticationManager authenticationManager,
			AuthenticationConverter authenticationConverter) {
		super(authenticationManager, authenticationConverter);
		// TODO Auto-generated constructor stub
	}
*/
	public class JwtUsernameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

		private final AuthenticationManager authenticationManager; 
		
		
		
		
		public JwtUsernameAndPasswordAuthenticationFilter(AuthenticationManager authenticationManager) {
			this.authenticationManager = authenticationManager;
		}




		@Override
		public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
				throws AuthenticationException {
			try {
				AuthenticationRequest authenticationRequest = 
						new ObjectMapper().readValue(request.getInputStream(), AuthenticationRequest.class);
				
				Authentication authentication = new UsernamePasswordAuthenticationToken(
						authenticationRequest.getUsername(),
						authenticationRequest.getPassword()
						);
				
					return authenticationManager.authenticate(authentication);
			} catch (java.io.IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		
		@Override
		protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
				Authentication authResult) throws java.io.IOException, ServletException {
			
			String key = "safesafesafesafesafesafesafesafesafe";
			String token = Jwts.builder()
					.setSubject(authResult.getName())
					.claim("authorities", authResult.getAuthorities())
					.setIssuedAt(new Date())
					.setExpiration(java.sql.Date.valueOf(LocalDate.now().plusWeeks(1)))
					.signWith(Keys.hmacShaKeyFor(key.getBytes()))
					.compact();
			
			response.setHeader("Authorization", "Bearer " + token);
		}
		
		
		
		
	}		
//}
