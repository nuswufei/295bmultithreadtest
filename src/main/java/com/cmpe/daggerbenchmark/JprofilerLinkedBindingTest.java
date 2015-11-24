package com.cmpe.daggerbenchmark;

public class JprofilerLinkedBindingTest {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 1000000; ++i) {
		    LinkedBindingComponent linkedBindingComponent 
		    		= DaggerLinkedBindingComponent.create();
		    MovieFinder mf = linkedBindingComponent.getMovieFinder();
		}
		System.out.println("done");
	}
}
