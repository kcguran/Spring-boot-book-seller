package com.sha.springbootbookseller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.sha.springbootbookseller.model.User;
import com.sha.springbootbookseller.security.UserPrincipal;
import com.sha.springbootbookseller.security.jwt.IJwtProvider;

@Service
public class AuthenticationService implements IAuthenticationService{

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private IJwtProvider jwtProvider;
	
	@Override
	public User singInAndReturnJWT(User signInRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword()));
		
		UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
		String jwt = jwtProvider.generateToken(userPrincipal);
		
		User signInUser = userPrincipal.getUser();
		signInUser.setToken(jwt);
		return signInUser;
	}
}