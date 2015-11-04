package com.cmpe.daggerbenchmark;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerLinkedBindingComponent implements LinkedBindingComponent {
  private Provider<MovieFinder> provideMovieFinderProvider;

  private DaggerLinkedBindingComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static LinkedBindingComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideMovieFinderProvider = LinkedBindingModule_ProvideMovieFinderFactory.create(builder.linkedBindingModule);
  }

  @Override
  public MovieFinder getMovieFinder() {  
    return provideMovieFinderProvider.get();
  }

  public static final class Builder {
    private LinkedBindingModule linkedBindingModule;
  
    private Builder() {  
    }
  
    public LinkedBindingComponent build() {  
      if (linkedBindingModule == null) {
        this.linkedBindingModule = new LinkedBindingModule();
      }
      return new DaggerLinkedBindingComponent(this);
    }
  
    public Builder linkedBindingModule(LinkedBindingModule linkedBindingModule) {  
      if (linkedBindingModule == null) {
        throw new NullPointerException("linkedBindingModule");
      }
      this.linkedBindingModule = linkedBindingModule;
      return this;
    }
  }
}

