package amm.vsu.dm.service.model.get;

import amm.vsu.dm.service.model.base.BaseDto;

public class ProductGetDto extends BaseDto {

  private String name;

  private String picture;

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
