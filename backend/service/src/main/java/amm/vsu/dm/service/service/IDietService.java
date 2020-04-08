package amm.vsu.dm.service.service;


import amm.vsu.dm.service.model.get.DietGetDto;

import java.util.List;

public interface IDietService {

  List<DietGetDto> getAll();

  DietGetDto getById(int id);
}
