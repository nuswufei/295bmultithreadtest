package com.cmpe.daggerbenchmark;

import dagger.Component;

@Component(modules = LinkedBindingModule.class)
public interface LinkedBindingComponent {
	MovieFinder getMovieFinder();
}
