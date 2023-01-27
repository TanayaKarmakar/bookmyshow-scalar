package com.app.bms.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author t0k02w6 on 23/01/23
 * @project bookmyshow-scalar
 */
@Getter
@Entity
@NoArgsConstructor
public class Show extends BaseModel {
  @ManyToOne
  private Movie movie;

  @Enumerated
  private Language language;
  private Date startTime;
  private Integer duration;

  @ManyToOne
  private Hall hall;

  @ElementCollection
  @Enumerated
  private List<MovieFeature> movieFeatures = new ArrayList<>();

  @OneToMany
  private List<ShowSeat> showSeats = new ArrayList<>();

  public Show(Long id, Date createdAt, Date updatedAt, Movie movie, Language language, Date startTime
  , Integer duration, Hall hall, List<MovieFeature> movieFeatures, List<ShowSeat> showSeats) {
    super(id, createdAt, updatedAt);
    this.movie = movie;
    this.language = language;
    this.startTime = startTime;
    this.duration = duration;
    this.hall = hall;
    this.movieFeatures = movieFeatures;
    this.showSeats = showSeats;
  }
}
