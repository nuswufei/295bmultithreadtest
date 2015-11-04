package com.cmpe.guicemultithreadtest;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.daggeradapter.DaggerAdapter;
public class MultiJprofilerLinkedBindingTest {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		for(int i = 0; i < 100000; ++i) {
			final Injector injector = Guice.createInjector();
			new Thread() {
				public void start() {
					injector.createChildInjector(new LinkedbindingModule0());
				}
			}.start();
			new Thread() {
				public void start() {
					injector.createChildInjector(new LinkedbindingModule1());
				}
			}.start();
			new Thread() {
				public void start() {
					injector.createChildInjector(new LinkedbindingModule2());
				}
			}.start();
			new Thread() {
				public void start() {
					injector.createChildInjector(new LinkedbindingModule3());
				}
			}.start();
		    
		}
		System.out.println(System.currentTimeMillis() - time);
	}

}
