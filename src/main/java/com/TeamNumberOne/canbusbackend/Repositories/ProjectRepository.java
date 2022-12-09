/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Repositories;

import com.TeamNumberOne.canbusbackend.Model.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Helps create temporary table to update without needing to directly query the database
 * Project is the table it is modifying and String is the data type for the Primary key
 */
public interface ProjectRepository extends CrudRepository<Project, String> {
}