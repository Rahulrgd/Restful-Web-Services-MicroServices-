package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

  private LocalDateTime timestamp;
  private String messege;
  private String details;

  public ErrorDetails(LocalDateTime timestamp, String messege, String details) {
    this.timestamp = timestamp;
    this.messege = messege;
    this.details = details;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public String getMessege() {
    return messege;
  }

  public String getDetails() {
    return details;
  }
}
