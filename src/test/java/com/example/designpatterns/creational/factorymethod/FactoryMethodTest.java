package com.example.designpatterns.creational.factorymethod;

import com.example.designpatterns.creational.factorymethod.impl.DrivingDirectionFactory;
import com.example.designpatterns.creational.factorymethod.impl.WalkingDirectionFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

  @Test
  public void try_factoryMethod(){
    Direction direction;
    DirectionFactory directionFactory;

    System.out.println("Client selected walking from UI");
    directionFactory = new WalkingDirectionFactory();

    direction = directionFactory.getDirections();
    direction.printEstimatedTime();

    System.out.println("Client selected driving from UI");
    directionFactory = new DrivingDirectionFactory();

    direction = directionFactory.getDirections();
    direction.printEstimatedTime();
  }
}
