package amm.vsu.dm.service.mapper;

import amm.vsu.dm.service.model.get.ProductGetDto;
import org.mapstruct.Mapper;
import amm.vsu.dm.repository.entity.Product;

import java.util.List;

/**
 * Maps between {@link Product} and it's DTOs.
 */
@Mapper
public interface IProductMapper {

  /**
   * Converts {@link Product} to {@link ProductGetDto}.
   *
   * @param entity entity to convert
   */

  ProductGetDto toGetDto(Product entity);

  List<ProductGetDto> toGetDto(List<Product> entity);

}
