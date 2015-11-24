package com.cmpe.guicebenchmark;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.daggeradapter.DaggerAdapter;

public class JprofilerLinkedBindingTest {

	public static void main(String[] args) {
		for(int i = 0; i < 100000; ++i) {
		    Injector injector = Guice.createInjector(new LinkedBindingModule());
		    Moviefinder mf = injector.getInstance(MoviefinderImpl.class);
		}
		System.out.println("done");
	}

}
