package com.in28minutes.rest.webservices.restfulwebservices.user;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private Integer id;

  private String description;

  @ManyToOne(fetch = FetchType.LAZY)
  private User user;

  public Post() {}

  public Post(String description) {
    this.description = description;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Post [id=" + id + ", description=" + description + "]";
  }
}
