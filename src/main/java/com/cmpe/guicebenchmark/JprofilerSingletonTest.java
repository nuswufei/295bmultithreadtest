package com.cmpe.guicebenchmark;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.daggeradapter.DaggerAdapter;

public class JprofilerSingletonTest extends Thread {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 1000000; ++i) {
		    Injector injector = Guice.createInjector(new SingletonModule());
		    Moviefinder mf = injector.getInstance(MoviefinderImpl.class);
		}
		System.out.println("done");
	}

}
