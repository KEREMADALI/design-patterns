package com.example.designpatterns.structural.decorator;

import com.example.designpatterns.structural.decorator.impl.Base64EncodeDecorator;
import com.example.designpatterns.structural.decorator.impl.DefaultEncodingDecorator;
import com.example.designpatterns.structural.decorator.impl.HashEncodeDecorator;
import org.junit.jupiter.api.Test;

public class DecoratorTests {

  @Test
  public void try_decorators() {
    EncodingDecorator encodingDecorator = new DefaultEncodingDecorator();
    encodingDecorator = new HashEncodeDecorator(encodingDecorator);
    encodingDecorator = new Base64EncodeDecorator(encodingDecorator);

    encodingDecorator.encode();
  }
}
