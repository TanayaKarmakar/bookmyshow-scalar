package com.app.bms.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
public class Theatre extends BaseModel {
  private String name;
  private String address;

  @OneToMany
  private List<Hall> halls = new ArrayList<>();

  @OneToMany
  private List<Show> shows = new ArrayList<>();


  public Theatre(Long id, Date createdAt, Date updatedAt, String name, String address, List<Hall> halls,
                 List<Show> shows) {
    super(id, createdAt, updatedAt);
    this.name = name;
    this.address = address;
    this.halls = halls;
    this.shows = shows;
  }
}
