package com.example.designpatterns.structural.decorator.impl;

import com.example.designpatterns.structural.decorator.EncodingDecorator;

public class HashEncodeDecorator extends BaseEncodingDecorator{

  public HashEncodeDecorator(EncodingDecorator encodingDecorator) {
    super(encodingDecorator);
  }

  @Override
  public void customEncode() {
    System.out.println("Hash encoded");
  }
}
