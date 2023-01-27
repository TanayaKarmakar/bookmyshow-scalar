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
public class Movie extends BaseModel {
  private String name;
  private Integer duration;
  private Double rating;

  @ElementCollection
  @Enumerated
  private List<Language> languages = new ArrayList<>();

  @ElementCollection
  @Enumerated
  private List<MovieFeature> features = new ArrayList<>();

  public Movie(Long id, Date createdAt, Date updatedAt, String name, Integer duration,
               Double rating, List<Language> languages, List<MovieFeature> features) {
    super(id, createdAt, updatedAt);
    this.name = name;
    this.duration = duration;
    this.rating = rating;
    this.languages = languages;
    this.features = features;
  }
}
