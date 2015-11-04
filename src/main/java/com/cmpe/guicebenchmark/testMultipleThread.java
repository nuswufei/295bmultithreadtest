package com.cmpe.guicebenchmark;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class testMultipleThread {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 1; ++i) {
		    Injector injector = Guice.createInjector();
		    injector.createChildInjector(new SingletonModule());
		    Moviefinder mf = injector.getInstance(MoviefinderImpl.class);
		}
		System.out.println("done");
	}
}
