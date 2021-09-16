package com.sebczu.poc.rest.hello.controller;

import com.sebczu.poc.rest.hello.api.ExternalHelloAPI;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalHelloController implements ExternalHelloAPI {

  @Override
  public String hello() {
    return "Hello!";
  }
}
