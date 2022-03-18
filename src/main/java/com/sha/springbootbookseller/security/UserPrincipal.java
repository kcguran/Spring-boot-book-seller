package com.sha.springbootbookseller.security;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sha.springbootbookseller.model.Role;
import com.sha.springbootbookseller.model.User;
import com.sha.springbootbookseller.util.SecurityUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPrincipal implements UserDetails{
	
	private Long id;
	private String username;
	transient private String password;
	transient private User user;
	private Set<GrantedAuthority> authorities;
	
	public static UserPrincipal createSuperUser() {
		
		Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(Role.SYSTEM_MANAGER.name()));
		
		return UserPrincipal.builder()
				.id(-1L)
				.username("system-administrator")
				.authorities(authorities)
				.build();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
