package com.security.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.entity.Login_Details;

public class AgentUserDetails implements UserDetails {
	
	private final  Login_Details userDetails;

	
	
	public AgentUserDetails(Login_Details userDetails) {
		super();
		this.userDetails = userDetails;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorities=new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(userDetails.getClient_Type()));
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userDetails.getpassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userDetails.getuser_name();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
//		return (userDetails.getcurrent_status().equalsIgnoreCase("ACTIVE")
//				|| userDetails.getcurrent_status().equalsIgnoreCase("ACTIVATE"))
//				;
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
//		return userDetails.getBlock_status().equalsIgnoreCase("UNBLOCKED");
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
