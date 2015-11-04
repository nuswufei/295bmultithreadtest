package com.cmpe.guicemultithreadtest;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class LinkedbindingModule1  extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides
	Moviefinder1 provideMovieFinder() {
		return new MoviefinderImpl1();
	}
}
