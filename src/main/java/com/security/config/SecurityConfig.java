package com.security.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * ENDPOINTS LEVEL AUTHENTICATION
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeHttpRequests()
		/*
		 * Default Configuration to authenticate all the requests
		 */
//				.anyRequest().authenticated()

		/*
		 * AUTHENTICATE ONLY REQUIRED REQUESTS
		 */

//		.antMatchers("/get-balance").authenticated()
//		.antMatchers("/my-account").authenticated()

				/*
				 * PERMIT FEW REQUIRED REQUESTS AND AUTHENTICATE ALL OTHER REQUESTS
				 */
				.antMatchers("/welcome").permitAll().antMatchers("/contact").permitAll().antMatchers("/notice")
				.permitAll().anyRequest().authenticated()

				/*
				 * DENY ALL THE REQUESTS
				 */
//				.anyRequest().denyAll()

				.and().formLogin().and().httpBasic();
	}

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { // TODO Auto-generated method stub
	 * auth.inMemoryAuthentication().withUser("admin").password("!@123Rah").
	 * authorities("admin").and().withUser("user")
	 * .password("12345").authorities("read").and().passwordEncoder(
	 * NoOpPasswordEncoder.getInstance());
	 * 
	 * }
	 */

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { // TODO Auto-generated method stub
	 * 
	 * InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	 * UserDetails admin =
	 * User.withUsername("admin").password("!@123Rah").authorities("admin").build();
	 * UserDetails user1 =
	 * User.withUsername("user1").password("12345").authorities("read").build();
	 * UserDetails user2 =
	 * User.withUsername("user2").password("12345").authorities("read").build();
	 * 
	 * manager.createUser(admin); manager.createUser(user1);
	 * manager.createUser(user2); auth.userDetailsService(manager); }
	 */

	@Bean
	public UserDetailsService userDetailsService(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
