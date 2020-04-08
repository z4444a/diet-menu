package amm.vsu.dm.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "diet", schema = "DM")
public class Diet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "diet_id", updatable = false)
  private Integer id;

  @Column(nullable = false)
  private String name;

  private String description;

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
}
