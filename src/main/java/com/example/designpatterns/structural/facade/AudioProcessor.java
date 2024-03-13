package com.example.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AudioProcessor {

  public void complicatedProcess1() {
    log.info("Complicated process_1 by AudioProcessor");
  }

  public void complicatedProcess2() {
    log.info("Complicated process_2 by AudioProcessor");
  }
}
