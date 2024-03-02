package com.example.designpatterns.structural.bridge.impl;

import com.example.designpatterns.structural.bridge.CreditCard;

public class StandardCard implements CreditCard {

  @Override
  public String getType() {
    return "Standard Card";
  }
}
