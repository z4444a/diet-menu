package amm.vsu.dm.service.service.impl;

import amm.vsu.dm.repository.repository.DietRepository;
import amm.vsu.dm.service.mapper.IDietMapper;
import amm.vsu.dm.service.model.get.DietGetDto;
import amm.vsu.dm.service.service.IDietService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DietServiceImpl implements IDietService {

  private final DietRepository repository;
  private final IDietMapper mapper;

  public DietServiceImpl(DietRepository repository, IDietMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public List<DietGetDto> getAll(){
    return mapper.toGetDto(repository.findAll());
  }

  @Override
  public DietGetDto getById(int id){
    return mapper.toGetDto(repository.findById(id).orElse(null));
  }
}
