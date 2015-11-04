package com.cmpe.daggerbenchmark;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import com.cmpe.daggerbenchmark.MovieFinder;
@Module
public class SingletonModule {
	@Provides @Singleton MovieFinder provideMovieFinder(){
		return new MovieFinderImpl();
	}
}
