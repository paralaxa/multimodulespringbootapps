package sk.demo.springboot.repository;


import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import sk.demo.springboot.model.Agency;

public interface AgencyRepository extends JpaRepository<Agency, UUID> {

}
