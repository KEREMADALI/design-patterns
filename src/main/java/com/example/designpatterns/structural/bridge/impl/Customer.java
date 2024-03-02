package com.example.designpatterns.structural.bridge.impl;

import com.example.designpatterns.structural.bridge.CreditCard;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public abstract class Customer {

  protected final CreditCard card;

  protected abstract String getCustomerType();

  public void printMetadata(){
    log.info("I am a {} with {}", getCustomerType(), card.getType());
  }
}
