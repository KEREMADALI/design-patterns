package com.example.designpatterns.structural.decorator.impl;

import com.example.designpatterns.structural.decorator.EncodingDecorator;

public class Base64EncodeDecorator extends BaseEncodingDecorator {

  public Base64EncodeDecorator(EncodingDecorator encodingDecorator) {
    super(encodingDecorator);
  }

  @Override
  public void customEncode() {
    System.out.println("Base64 encoded");
  }
}
