package layzadev.github.io.model.repository;

import layzadev.github.io.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}

