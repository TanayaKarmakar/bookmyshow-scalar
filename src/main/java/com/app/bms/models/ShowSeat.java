package com.app.bms.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class ShowSeat extends BaseModel{
  private Double price;

  @Enumerated
  private SeatStatus seatStatus;

  @ManyToOne
  private Seat seat;


  public ShowSeat(Long id, Date createdAt, Date updatedAt, Double price, SeatStatus seatStatus, Seat seat) {
    super(id, createdAt, updatedAt);
    this.price = price;
    this.seatStatus = seatStatus;
    this.seat = seat;
  }
}
