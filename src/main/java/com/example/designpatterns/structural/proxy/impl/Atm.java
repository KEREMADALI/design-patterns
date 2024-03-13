package com.example.designpatterns.structural.proxy.impl;

import com.example.designpatterns.structural.proxy.MoneyTransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Atm implements MoneyTransferService {

  private final MoneyTransferService bank;

  @Override
  public void withdraw(double amount) {
    log.info("Giving money to customer");
    bank.withdraw(amount);
  }
}
