package org.springframework.security.samples.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 
 * Automatically register the springSecurityFilterChain Filter for every URL in
 * your application.
 * 
 * The way in which we use AbstractSecurityWebApplicationInitializer differs
 * depending on if we are already using Spring or if Spring Security is the only
 * Spring component in our application.
 * 
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}