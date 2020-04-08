package amm.vsu.dm.service.model.get;

import amm.vsu.dm.service.model.base.BaseDto;

public class DiseaseGetDto extends BaseDto {

  private String name;
  private String description;
  private String diet;

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

  public String getDiet() {
    return diet;
  }

  public void setDiet(String diet) {
    this.diet = diet;
  }
}
