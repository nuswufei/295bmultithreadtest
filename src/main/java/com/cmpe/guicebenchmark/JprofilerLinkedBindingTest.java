package com.cmpe.guicebenchmark;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.daggeradapter.DaggerAdapter;

public class JprofilerLinkedBindingTest {

	public static void main(String[] args) {
		for(int i = 0; i < 1000000; ++i) {
		    Injector injector = Guice.createInjector(DaggerAdapter.from(new DaggerSingletonModule()));
		    Moviefinder mf = injector.getInstance(MoviefinderImpl.class);
		}
		System.out.println("done");
	}

}
