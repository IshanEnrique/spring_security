package com.spring.web.config;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.spring.web.domain.Users;
import com.spring.web.utils.CommonUtils;

@Configuration
public class SecurityConfig {
	private static final String[] WHITELIST = {

			"/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/security", "/swagger-ui.html",
			"/swagger-ui/**", "/v3/api-docs/**", "/h2-console/**", "/auth-gen/**", "/webjars/**", "/", "/home"

	};

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.requestMatchers(
				Arrays.asList(WHITELIST).stream().map(AntPathRequestMatcher::new).toArray(AntPathRequestMatcher[]::new))
				.permitAll().anyRequest().authenticated());
		http
//		formLogin(form->
//				form
//				.loginPage("/login").permitAll()
//				.defaultSuccessUrl("/home")
//				.isCustomLoginPage()
//				)
//		.logout(logout-> logout.logoutSuccessUrl("/home").permitAll())
				.csrf(csrf -> csrf.disable()).httpBasic(withDefaults());
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		List<Users> userList = CommonUtils.mapJsonFileToList("users.json", Users.class);
		List<UserDetails> userDetailsList = userList.stream().map(user -> 
			User.withUsername(user.getUsername()).password(user.getPassword())
					.authorities(user.getRole().stream().toArray(String[]::new))
					.build()
		).toList();

		return new InMemoryUserDetailsManager(userDetailsList);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
