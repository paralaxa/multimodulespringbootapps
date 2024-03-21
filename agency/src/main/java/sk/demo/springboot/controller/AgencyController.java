package sk.demo.springboot.controller;

import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.demo.springboot.dto.AgencyResponse;

@RestController
@RequestMapping("/agency")
public class AgencyController {


  @GetMapping
  public AgencyResponse getAgency() {
    return new AgencyResponse(UUID.randomUUID(), "Agency");
  }
}
