package com.sebczu.poc.rest.hello.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public interface ExternalHelloAPI {

  @GetMapping
  String hello();

}
