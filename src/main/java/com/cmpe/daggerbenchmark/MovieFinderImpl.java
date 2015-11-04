package com.cmpe.daggerbenchmark;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieFinderImpl implements MovieFinder {
    public MovieFinderImpl(){}
    public List<String> getMovies(){
        List<String> list = new ArrayList<String>();
        list.add("Psycho");
        list.add("12 Angry Men");
        list.add("The Godfather");
        return list;              
    }    
}
