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
public class Payment extends BaseModel {
  private String referenceId;
  private Double amount;

  @Enumerated
  private PaymentMode paymentMode;

  @Enumerated
  private PaymentStatus paymentStatus;


  public Payment(Long id, Date createdAt, Date updatedAt, String referenceId,
                 Double amount, PaymentMode paymentMode, PaymentStatus paymentStatus) {
    super(id, createdAt, updatedAt);
    this.referenceId = referenceId;
    this.amount = amount;
    this.paymentMode = paymentMode;
    this.paymentStatus = paymentStatus;
  }
}
