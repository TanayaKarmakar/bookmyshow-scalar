package com.app.bms.models;

import java.util.Date;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Entity
@Setter
@NoArgsConstructor
public class Users extends BaseModel {
  private String email;

  public Users(Long id, Date createdAt, Date updatedAt, String email) {
    super(id, createdAt, updatedAt);
    this.email = email;
  }
}
