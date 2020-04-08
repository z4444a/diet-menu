package amm.vsu.dm.service.service.impl;

import amm.vsu.dm.repository.repository.DiseaseRepository;
import amm.vsu.dm.service.mapper.IDiseaseMapper;
import amm.vsu.dm.service.model.get.DiseaseGetDto;
import amm.vsu.dm.service.service.IDiseaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseServiceImpl implements IDiseaseService {

  private final DiseaseRepository repository;
  private final IDiseaseMapper mapper;

  public DiseaseServiceImpl(DiseaseRepository repository, IDiseaseMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public List<DiseaseGetDto> getAll(){
    return mapper.toGetDto(repository.findAll());
  }

  @Override
  public DiseaseGetDto getById(int id){
    return mapper.toGetDto(repository.findById(id).orElse(null));
  }
}
