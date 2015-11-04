package com.cmpe.daggerbenchmark;

import dagger.Module;
import dagger.Provides;

@Module
public class LinkedBindingModule {
	@Provides MovieFinder provideMovieFinder(){
		return new MovieFinderImpl();
	}
}
