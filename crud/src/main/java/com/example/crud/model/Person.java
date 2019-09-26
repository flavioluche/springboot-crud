package com.example.crud.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	public Person(@JsonProperty("id") UUID id,
					@JsonProperty("name") String name) {
		this.id = id;
		this.name = name;
	}
	
	private final UUID id;
	@NotBlank
	private final String name;
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
