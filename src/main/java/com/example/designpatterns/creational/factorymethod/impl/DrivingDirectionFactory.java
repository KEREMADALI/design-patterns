package com.example.designpatterns.creational.factorymethod.impl;

import com.example.designpatterns.creational.factorymethod.Direction;
import com.example.designpatterns.creational.factorymethod.DirectionFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DrivingDirectionFactory implements DirectionFactory {

  @Override
  public Direction getDirections() {
    log.info("Doing driving specific pre-work");

    return new DrivingDirection();
  }
}
