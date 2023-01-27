package com.app.bms.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Ticket extends BaseModel{
  @ManyToOne
  private Show show;

  @ManyToOne
  private Users user;

  @ManyToMany
  private List<ShowSeat> seats = new ArrayList<>();

  private Double amount;

  @Enumerated
  private TicketStatus status;

  @OneToOne
  private Payment payment;

  public Ticket(Long id, Date createdAt, Date updatedAt, Show show,
                Users user, List<ShowSeat> seats, Double amount, TicketStatus status, Payment payment) {
    super(id, createdAt, updatedAt);
    this.show = show;
    this.user = user;
    this.seats = seats;
    this.amount = amount;
    this.status = status;
    this.payment = payment;
  }
}
