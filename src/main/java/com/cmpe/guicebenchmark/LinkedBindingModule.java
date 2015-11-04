package com.cmpe.guicebenchmark;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class LinkedBindingModule  extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides
	Moviefinder provideMovieFinder() {
		return new MoviefinderImpl();
	}
}
