package com.cmpe.daggerbenchmark;

import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerSingletonComponent implements SingletonComponent {
  private Provider<MovieFinder> provideMovieFinderProvider;

  private DaggerSingletonComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static SingletonComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideMovieFinderProvider = ScopedProvider.create(SingletonModule_ProvideMovieFinderFactory.create(builder.singletonModule));
  }

  @Override
  public MovieFinder getMovieFinder() {  
    return provideMovieFinderProvider.get();
  }

  public static final class Builder {
    private SingletonModule singletonModule;
  
    private Builder() {  
    }
  
    public SingletonComponent build() {  
      if (singletonModule == null) {
        this.singletonModule = new SingletonModule();
      }
      return new DaggerSingletonComponent(this);
    }
  
    public Builder singletonModule(SingletonModule singletonModule) {  
      if (singletonModule == null) {
        throw new NullPointerException("singletonModule");
      }
      this.singletonModule = singletonModule;
      return this;
    }
  }
}

