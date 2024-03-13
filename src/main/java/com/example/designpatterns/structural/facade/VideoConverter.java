package com.example.designpatterns.structural.facade;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VideoConverter {

  private final AudioProcessor audioProcessor;
  private final ImageProcessor imageProcessor;
  public void convertVideo(){
    audioProcessor.complicatedProcess1();
    audioProcessor.complicatedProcess2();
    imageProcessor.complicatedProcess1();
    imageProcessor.complicatedProcess2();
  }
}
