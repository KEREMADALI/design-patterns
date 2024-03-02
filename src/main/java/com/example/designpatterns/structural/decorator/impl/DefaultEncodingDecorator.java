package com.example.designpatterns.structural.decorator.impl;

import com.example.designpatterns.structural.decorator.EncodingDecorator;

public class DefaultEncodingDecorator implements EncodingDecorator {

  @Override
  public void encode() {
    System.out.println("Default encoding");
  }
}
