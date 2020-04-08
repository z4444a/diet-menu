package amm.vsu.dm.repository.entity;

import javax.persistence.*;


@Entity
@Table(name = "diseases", schema = "DM")
public class Disease {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "disease_id", updatable = false)
  private Integer id;

  @Column(nullable = false)
  private String name;

  private String description;

  @ManyToOne
  @JoinColumn(name = "diet_id", nullable = false)
  private Diet diet;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Diet getDiet() {
    return diet;
  }

  public void setDiet(Diet diet) {
    this.diet = diet;
  }
}
