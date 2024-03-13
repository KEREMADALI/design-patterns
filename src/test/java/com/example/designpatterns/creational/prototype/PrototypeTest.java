package com.example.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeTest {

  @Test
  public void try_prototype(){
    Device device = new Device();
    device.setId("testId");
    device.setName("testName");

    Device cloneDevice = device.clone();

    assertNotEquals(device, cloneDevice);
    assertEquals(device.getId(), cloneDevice.getId());
    assertEquals(device.getName(), cloneDevice.getName());
  }
}
