package com.cmpe.daggerbenchmark;

public class JprofilerSingletonTest {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 1000000; ++i) {
		    SingletonComponent singletonComponent = DaggerSingletonComponent.create();
		    MovieFinder mf = singletonComponent.getMovieFinder();
		}
		System.out.println("done");
	}

}
