package com.app.bms.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Entity
@NoArgsConstructor
public class Hall extends BaseModel {
  private Integer hallNumber;

  @Enumerated
  @ElementCollection
  private List<MovieFeature> features = new ArrayList<>();

  public Hall(Long id, Date createdAt, Date updatedAt, Integer hallNumber) {
    super(id, createdAt, updatedAt);
    this.hallNumber = hallNumber;
  }
}
