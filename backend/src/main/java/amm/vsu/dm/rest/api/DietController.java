package amm.vsu.dm.rest.api;

import amm.vsu.dm.service.model.get.DietGetDto;
import amm.vsu.dm.service.service.IDietService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diets")
public class DietController {

  private final IDietService service;

  public DietController(IDietService service) {
    this.service = service;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<DietGetDto> getAll() {
    return service.getAll();
  }

  @GetMapping(
      path = "/{id}",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public DietGetDto getById(@PathVariable Integer id) {
    return service.getById(id);
  }
}
