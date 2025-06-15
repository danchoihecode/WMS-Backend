package openerp.openerpresourceserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import openerp.openerpresourceserver.entity.EntityAuthorization;

import java.util.List;

public interface EntityAuthorizationRepository extends JpaRepository<EntityAuthorization, String> {

    List<EntityAuthorization> findAllByIdStartingWithAndRoleIdIn(String prefix, List<String> roleIds);
}
