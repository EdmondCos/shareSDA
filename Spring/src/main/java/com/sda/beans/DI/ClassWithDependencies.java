package com.sda.beans.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component



public class ClassWithDependencies {
    @Autowired
    private DependencyField dependencyField;

    private DependencyConstructor dependencyConstructor;
    private DependencySetter dependencySetter;


@Autowired
    public ClassWithDependencies (DependencyConstructor dc) {
      this.dependencyConstructor=dc;
    }
    @Autowired

    public void setDependencySetter(DependencySetter ds){
    this.dependencySetter = ds;
    }

    public DependencyField getDependencyField() {
        return dependencyField;
    }

    public DependencyConstructor getDependencyConstructor() {
        return dependencyConstructor;
    }

    public DependencySetter getDependencySetter() {
        return dependencySetter;
    }
}
