package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

  private static List<User> users = new ArrayList<>();

  public static Integer userCount = 0;

  static {
    users.add(new User(++userCount, "Rahul", LocalDate.now().minusYears(25)));
    users.add(new User(++userCount, "Rahi", LocalDate.now().minusYears(25)));
    users.add(
      new User(++userCount, "Satendra", LocalDate.now().minusYears(25))
    );
  }

  public List<User> findAll() {
    return users;
  }

  public User findUser(Integer id) {
    return users
      .stream()
      .filter(user -> user.getId().equals(id))
      .findFirst()
      .get();
  }

  public User save(User user) {
    user.setId(++userCount);
    users.add(user);
    return user;
  }
}
