package amm.vsu.dm.service.service;

import amm.vsu.dm.service.model.get.DiseaseGetDto;

import java.util.List;

public interface IDiseaseService {

  List<DiseaseGetDto> getAll();

  DiseaseGetDto getById(int id);
}
