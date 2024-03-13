package com.example.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class BaseDevice {

  private String id;

  public BaseDevice(BaseDevice prototype){
    this.id = prototype.id;
  }

  public abstract BaseDevice clone();
}
