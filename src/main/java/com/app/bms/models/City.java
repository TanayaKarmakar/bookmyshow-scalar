package com.app.bms.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Entity
@Table(name = "CITIES")
@NoArgsConstructor
public class City extends BaseModel {

  private String name;

  @OneToMany
  private List<Theatre> theatres = new ArrayList<>();

  public City(Long id, Date createdAt, Date updatedAt, String name) {
    super(id, createdAt, updatedAt);
    this.name = name;
  }
}
