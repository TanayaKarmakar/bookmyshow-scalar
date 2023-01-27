package com.app.bms.controllers;

import com.app.bms.dtos.UserDTO;
import com.app.bms.exceptions.InvalidEmailException;
import com.app.bms.models.Users;
import com.app.bms.services.UserService;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author t0k02w6 on 26/01/23
 * @project bookmyshow-scalar
 */
@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public Users getUser(@PathVariable Long id) {
    return userService.getUser(id);
  }

  @PostMapping
  public Users createUser(@RequestBody UserDTO userDTO) {
    validate(userDTO);
    return userService.createUser(userDTO);
  }

  private void validate(UserDTO userDTO) {
    if(Objects.isNull(userDTO.getEmail()))
      throw new InvalidEmailException("Email is absent");
  }
}
