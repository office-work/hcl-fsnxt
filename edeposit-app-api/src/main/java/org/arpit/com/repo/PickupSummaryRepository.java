package org.arpit.com.repo;

import org.arpit.com.entity.PickupSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface PickupSummaryRepository extends JpaRepository<PickupSummary, Long>{

}
