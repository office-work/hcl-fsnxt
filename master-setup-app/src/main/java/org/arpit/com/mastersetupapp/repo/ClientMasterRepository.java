package org.arpit.com.mastersetupapp.repo;

import org.arpit.com.mastersetupapp.entity.ClientMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientMasterRepository extends JpaRepository<ClientMaster, Long> {

}
