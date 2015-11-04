package com.cmpe.daggerbenchmark;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LinkedBindingModule_ProvideMovieFinderFactory implements Factory<MovieFinder> {
  private final LinkedBindingModule module;

  public LinkedBindingModule_ProvideMovieFinderFactory(LinkedBindingModule module) {  
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

  public static Factory<MovieFinder> create(LinkedBindingModule module) {  
    return new LinkedBindingModule_ProvideMovieFinderFactory(module);
  }
}

