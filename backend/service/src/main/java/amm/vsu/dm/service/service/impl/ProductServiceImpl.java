package amm.vsu.dm.service.service.impl;

import amm.vsu.dm.service.mapper.IProductMapper;
import amm.vsu.dm.service.model.get.ProductGetDto;
import amm.vsu.dm.service.service.IProductService;
import org.springframework.stereotype.Service;
import amm.vsu.dm.repository.repository.ProductRepository;

import java.util.List;


@Service
public class ProductServiceImpl implements IProductService {
  private final ProductRepository repository;
  private final IProductMapper mapper;

  /**
   * Constructor.
   */
  public ProductServiceImpl(ProductRepository repository, IProductMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public List<ProductGetDto> getAll(){
    return mapper.toGetDto(repository.findAll());
  }

  @Override
  public ProductGetDto getById(int id){
    return mapper.toGetDto(repository.findById(id).orElse(null));
  }
}
