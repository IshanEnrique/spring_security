package com.security.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.entity.Login_Details;
import com.security.repo.LoginDetailsRepo;

@Service
public class AgentUserDetailsService implements UserDetailsService {

	@Autowired
	private LoginDetailsRepo userLoginDetailsRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<Login_Details> user=userLoginDetailsRepo.findByUserName(username);
		if(user.size()==0)
			throw new UsernameNotFoundException("User not found on username : "+username);
		
		return new AgentUserDetails(user.get(0));
	}

}
