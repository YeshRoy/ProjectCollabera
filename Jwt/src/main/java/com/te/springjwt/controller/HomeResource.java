package com.te.springjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.te.springjwt.jwtUtil.JwtUtil;

public class HomeResource {
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/home")
	public String home() {
		return "learn SpringSecurityJwt";
	}
	
	public ResponseEntity<?> creatAuthenticationToken(@RequestBody AuthenticateRequest authenticaterequest ) {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticaterequest.getUserName(), authenticaterequest.getUserPassword()));
		} catch (AuthenticationException e) {
			throw new Exception("Invalid Username and Password"+e);
			e.printStackTrace();
		}
		UserDetails userDetails = userDetailsService.loadUserByUsername(authenticaterequest.getUsername);
				String jwt=jwtUtil.generateToken(userDetails);
				return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}






}
