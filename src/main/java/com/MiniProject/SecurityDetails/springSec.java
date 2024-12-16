package com.MiniProject.SecurityDetails;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class springSec {
	//In Memory Authentication
	/*
	 * @Bean public PasswordEncoder passwordencoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * @Bean //Roles and Password assign. public UserDetailsService
	 * userdetailsservice() { UserDetails admin = User.builder()
	 * .username("AwejShaikh") .password(passwordencoder().encode("8797"))
	 * .roles("ADMIN") .build();
	 * 
	 * UserDetails user = User .builder() .username("Chinmay")
	 * .password(passwordencoder().encode("chinu")) .roles("USER") .build(); return
	 * new InMemoryUserDetailsManager(admin, user); }
	 */
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity security) throws Exception
	{
		return security 
		.authorizeHttpRequests(auth->auth
				.requestMatchers("/userone").permitAll()
				.requestMatchers("/usertwo").hasRole("USER")
				.requestMatchers("/getAll").hasRole("ADMIN")
				.requestMatchers("/posting").hasRole("ADMIN")
				.anyRequest()
				.authenticated())
		.formLogin(form->form
				.permitAll()
		   .defaultSuccessUrl("/usertwo", true)) 
				.build();
	}

}
