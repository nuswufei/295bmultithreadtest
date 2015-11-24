package com.cmpe.guicemultithreadtest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MultipleInjectorTesting {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		for(int i = 0; i < 100000; ++i) {
			new Thread() {
				public void start() {
					Injector injector = Guice.createInjector(new LinkedbindingModule0());
				}
			}.start();
			new Thread() {
				public void start() {
					Injector injector = Guice.createInjector(new LinkedbindingModule1());
				}
			}.start();
			new Thread() {
				public void start() {
					Injector injector = Guice.createInjector(new LinkedbindingModule2());
				}
			}.start();
			new Thread() {
				public void start() {
					Injector injector = Guice.createInjector(new LinkedbindingModule3());
				}
			}.start();
		}
		System.out.println(System.currentTimeMillis() - time);
	}
}
