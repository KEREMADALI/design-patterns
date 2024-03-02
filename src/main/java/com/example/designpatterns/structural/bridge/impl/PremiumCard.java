package com.example.designpatterns.structural.bridge.impl;

import com.example.designpatterns.structural.bridge.CreditCard;

public class PremiumCard implements CreditCard {

  @Override
  public String getType() {
    return "Premium Card";
  }
}
