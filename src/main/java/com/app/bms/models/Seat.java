package com.app.bms.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Entity
@NoArgsConstructor
public class Seat extends BaseModel{
  private Integer row;
  private Integer col;

  @Enumerated
  private SeatType type;

  public Seat(Long id, Date createdAt, Date updatedAt, Integer row, Integer col, SeatType type) {
    super(id, createdAt, updatedAt);
    this.row = row;
    this.col = col;
    this.type = type;
  }
}
