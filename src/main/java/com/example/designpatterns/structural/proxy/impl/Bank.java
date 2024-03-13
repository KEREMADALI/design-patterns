package com.example.designpatterns.structural.proxy.impl;

import com.example.designpatterns.structural.proxy.MoneyTransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Bank implements MoneyTransferService {

  @Override
  public void withdraw(double amount) {
    log.info("Withdraw {} amount of money from bank", amount);
  }
}
