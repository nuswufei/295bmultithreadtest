package com.cmpe.guicemultithreadtest;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class LinkedbindingModule3  extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides
	Moviefinder3 provideMovieFinder() {
		return new MoviefinderImpl3();
	}
}
