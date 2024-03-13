package com.example.designpatterns.creational.factorymethod.impl;

import com.example.designpatterns.creational.factorymethod.Direction;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WalkingDirection implements Direction {

  @Override
  public void printEstimatedTime() {
    log.info("Road to bla bla takes y minutes on foot");
  }
}
