package com.app.bms.services.impl;

import com.app.bms.dtos.UserDTO;
import com.app.bms.models.Users;
import com.app.bms.repositories.UserRepository;
import com.app.bms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author t0k02w6 on 26/01/23
 * @project bookmyshow-scalar
 */
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public Users getUser(Long id) {
    return null;
  }

  @Override
  public Users createUser(UserDTO userDTO) {
    System.out.println("Creating user with Email " + userDTO.getEmail());
    Users user = userDTO.toUser();
    return userRepository.save(user);
  }


}
