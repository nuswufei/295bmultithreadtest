package com.cmpe.daggerbenchmark;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SingletonModule_ProvideMovieFinderFactory implements Factory<MovieFinder> {
  private final SingletonModule module;

  public SingletonModule_ProvideMovieFinderFactory(SingletonModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public MovieFinder get() {  
    MovieFinder provided = module.provideMovieFinder();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MovieFinder> create(SingletonModule module) {  
    return new SingletonModule_ProvideMovieFinderFactory(module);
  }
}

