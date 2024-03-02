package com.example.designpatterns.structural.bridge.impl;

import com.example.designpatterns.structural.bridge.CreditCard;

public class HighEarningCustomer extends Customer {

  public HighEarningCustomer(CreditCard card) {
    super(card);
  }

  @Override
  protected String getCustomerType() {
    return "High Earning Customer";
  }
}
