package amm.vsu.dm.service.mapper;

import amm.vsu.dm.repository.entity.Diet;
import amm.vsu.dm.service.model.get.DietGetDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IDietMapper {

  DietGetDto toGetDto(Diet entity);

  List<DietGetDto> toGetDto(List<Diet> entity);
}
