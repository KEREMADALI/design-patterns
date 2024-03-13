package com.example.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProxyTest {

  @Autowired
  private MoneyTransferService atm;

  @Test
  public void try_proxy(){
    atm.withdraw(100.0d);
  }

}
