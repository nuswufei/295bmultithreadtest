package com.cmpe.daggerbenchmark;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = SingletonModule.class)
public interface SingletonComponent {
	MovieFinder getMovieFinder();
}
