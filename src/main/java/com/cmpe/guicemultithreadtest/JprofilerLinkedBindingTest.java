package com.cmpe.guicemultithreadtest;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.daggeradapter.DaggerAdapter;

public class JprofilerLinkedBindingTest {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		for(int i = 0; i < 100000; ++i) {
		    Injector injector = Guice.createInjector(new LinkedbindingModule0(), 
		    		new LinkedbindingModule1(),
		    new LinkedbindingModule2(),
		    new LinkedbindingModule3());
		    
		}
		System.out.println(System.currentTimeMillis() - time);
	}
}
