package com.example.designpatterns.structural.decorator.impl;

import com.example.designpatterns.structural.decorator.EncodingDecorator;

public abstract class BaseEncodingDecorator implements EncodingDecorator {

  private final EncodingDecorator innerDecorator;

  public BaseEncodingDecorator(EncodingDecorator encodingDecorator){
    this.innerDecorator = encodingDecorator;
  }

  @Override
  public void encode() {
    innerDecorator.encode();
    customEncode();
  }

  public abstract void customEncode();
}
