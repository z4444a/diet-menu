package amm.vsu.dm.service.service;

import amm.vsu.dm.service.model.get.ProductGetDto;

import java.util.List;

public interface IProductService {

  List<ProductGetDto> getAll();

  ProductGetDto getById(int id);
}
