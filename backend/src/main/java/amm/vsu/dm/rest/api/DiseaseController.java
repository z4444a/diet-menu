package amm.vsu.dm.rest.api;

import amm.vsu.dm.service.model.get.DiseaseGetDto;
import amm.vsu.dm.service.service.IDiseaseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diseases")
public class DiseaseController {

  private final IDiseaseService service;

  public DiseaseController(IDiseaseService service) {
    this.service = service;
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public List<DiseaseGetDto> getAll() {
    return service.getAll();
  }

  @GetMapping(
      path = "/{id}",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public DiseaseGetDto getById(@PathVariable Integer id) {
    return service.getById(id);
  }
}
