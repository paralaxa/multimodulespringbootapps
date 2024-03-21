package sk.demo.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Agency {

  @Id
  private UUID id;

  private String name;
}
