package com.app.bms.services;

import com.app.bms.dtos.UserDTO;
import com.app.bms.models.Users;

/**
 * @author t0k02w6 on 26/01/23
 * @project bookmyshow-scalar
 */
public interface UserService {
  Users getUser(Long id);

  Users createUser(UserDTO userDTO);
}
