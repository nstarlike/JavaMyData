package nstarlike.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nstarlike.app.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
