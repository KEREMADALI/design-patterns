package com.example.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

  @Test
  public void try_facade(){
    VideoConverter videoConverter = new VideoConverter(new AudioProcessor(), new ImageProcessor());

    videoConverter.convertVideo();
  }
}
