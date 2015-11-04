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
	static String decode(String encoded) {
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < encoded.length(); ++i) {
			char cur = encoded.charAt(i);
			if(cur <= 'z' && cur >= 'a') {
				char ch = cur == 'a' ? 'z' : (char) (cur - 1);
				res.append(ch);
			} else {
				res.append(cur);
			}
		}
		return res.toString();
	}
}
