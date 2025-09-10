package com.master.oslyOnlineShoping.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
class ControllerExceptionHandler {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String handleException(HttpServletRequest req, RuntimeException ex) {

    logger.error("Issue with HTTP request...");
    return ex.getLocalizedMessage();
  }
}
