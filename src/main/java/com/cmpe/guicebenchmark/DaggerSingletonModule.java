package com.cmpe.guicebenchmark;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
public class DaggerSingletonModule {
	@Singleton @Provides Moviefinder provideMovieFinder(){
		return new MoviefinderImpl();
	}
}
