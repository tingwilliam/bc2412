package com.bootcamp.class_demo_helloworld.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // Serialization (Object -> JSON)
@AllArgsConstructor
public class Cat {
  private String name;
  private int age;
}