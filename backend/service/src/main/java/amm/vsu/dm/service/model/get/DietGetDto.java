package amm.vsu.dm.service.model.get;

import amm.vsu.dm.service.model.base.BaseDto;

public class DietGetDto extends BaseDto {

  private String name;
  private String description;

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
