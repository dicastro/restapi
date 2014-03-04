package com.qopuir.restapi.core.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.qopuir.restapi.core.service.PodcastRestService;
import com.wordnik.swagger.jersey.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jersey.listing.JerseyApiDeclarationProvider;
import com.wordnik.swagger.jersey.listing.JerseyResourceListingProvider;

public class RestApiApplication extends ResourceConfig {
	/**
	 * Register JAX-RS application components.
	 */
	public RestApiApplication() {
		register(JacksonFeature.class);
		
		register(ApiListingResourceJSON.class);
		register(JerseyApiDeclarationProvider.class);
		register(JerseyResourceListingProvider.class);
		
		register(PodcastRestService.class);
	}
}