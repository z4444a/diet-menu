package amm.vsu.dm.rest.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import amm.vsu.dm.service.model.get.ProductGetDto;
import amm.vsu.dm.service.service.IProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  private final IProductService service;

  /**
   * Constructor.
   */
  public ProductController(IProductService service) {
    this.service = service;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<ProductGetDto> getAll() {
    return service.getAll();
  }

  @GetMapping(
      path = "/{id}",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public ProductGetDto getById(@PathVariable Integer id) {
    return service.getById(id);
  }
}
