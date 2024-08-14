package com.mock.sample.sample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @CrossOrigin(origins = "*")
  @GetMapping("/")
  public String get() {
    return "main";
  }

  @CrossOrigin(origins = "*")
  @GetMapping("/200")
  public String getSample() {
    return "sample";
  }

  @CrossOrigin(origins = "http://localhost")
  @GetMapping("/localhost")
  public String getSample1() {
    return "sample1";
  }

  @CrossOrigin(origins = "http://abc.com")
  @GetMapping("/abc")
  public String getSample2() {
    return "sample2";
  }

}
