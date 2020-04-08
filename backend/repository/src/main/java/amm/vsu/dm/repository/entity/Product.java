package amm.vsu.dm.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "DM")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id", updatable = false)
  private Integer id;

  @Column(nullable = false)
  private String name;

  private String picture;

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

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
