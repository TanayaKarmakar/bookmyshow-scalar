package com.app.bms.dtos;

import com.app.bms.models.Users;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author t0k02w6 on 27/01/23
 * @project bookmyshow-scalar
 */
@Setter
@Getter
public class UserDTO {
  private String email;

  public Users toUser() {
    Users user = new Users();
    user.setEmail(this.getEmail());
    return user;
  }
}
