package org.csizmadia.vote2018hu.data;

import org.springframework.data.repository.CrudRepository;

/**
 * This repository can be used for CRUD operations related to {@link Organization}
 * entities.
 * 
 * @author Tamas Csizmadia
 */
public interface OrganizationRepository extends CrudRepository<Organization, String> {

}