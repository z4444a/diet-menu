package amm.vsu.dm.service.mapper;

import amm.vsu.dm.repository.entity.Disease;
import amm.vsu.dm.service.model.get.DiseaseGetDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface IDiseaseMapper {

  @Mapping(target = "diet", source = "diet.name")
  DiseaseGetDto toGetDto(Disease entity);

  List<DiseaseGetDto> toGetDto(List<Disease> entity);
}
