package com.cmpe.guicemultithreadtest;

import java.util.ArrayList;
import java.util.List;

public class MoviefinderImpl1 implements Moviefinder1 {

	@Override
	public List<String> getMovies(){
        List<String> list = new ArrayList<String>();
        list.add("Psycho");
        list.add("12 Angry Men");
        list.add("The Godfather");
        return list;              
    }  

}
