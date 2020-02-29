package com.example.gitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 */

@RestController
public class IndexController {

  @GetMapping("/index")
  public String index() {
      return "this is gitdemo";
  }

  @GetMapping("/index2")
  public String index2() {
      return "this is index2 method";
  }

}