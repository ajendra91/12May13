package com.example.RepositoryRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "demo",path = "demo")
public interface Demodao extends JpaRepository<Java, Integer> {
}
