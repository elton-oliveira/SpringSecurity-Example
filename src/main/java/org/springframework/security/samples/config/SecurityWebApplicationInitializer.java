package org.springframework.security.samples.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 
 * Automatically register the springSecurityFilterChain Filter for every URL in your application
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}
}