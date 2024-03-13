package com.example.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Device extends BaseDevice {
  private String name;

  public Device(Device prototype){
    super(prototype);
    this.name = prototype.name;
  }

  public Device clone(){
    return new Device(this);
  }
}
