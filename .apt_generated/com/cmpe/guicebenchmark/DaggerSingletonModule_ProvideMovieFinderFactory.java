package com.cmpe.guicebenchmark;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSingletonModule_ProvideMovieFinderFactory implements Factory<Moviefinder> {
  private final DaggerSingletonModule module;

  public DaggerSingletonModule_ProvideMovieFinderFactory(DaggerSingletonModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Moviefinder get() {  
    Moviefinder provided = module.provideMovieFinder();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Moviefinder> create(DaggerSingletonModule module) {  
    return new DaggerSingletonModule_ProvideMovieFinderFactory(module);
  }
}

