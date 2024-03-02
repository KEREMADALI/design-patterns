package com.example.designpatterns.structural.bridge.impl;

import com.example.designpatterns.structural.bridge.CreditCard;

public class LowEarningCustomer extends Customer {

  public LowEarningCustomer(CreditCard card) {
    super(card);
  }

  @Override
  protected String getCustomerType() {
    return "Low Earning Customer";
  }
}
