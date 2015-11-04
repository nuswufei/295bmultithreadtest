package com.cmpe.guicebenchmark;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;


public class SingletonModule extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides @Singleton
	Moviefinder provideMovieFinder() {
		return new MoviefinderImpl();
	}
}
