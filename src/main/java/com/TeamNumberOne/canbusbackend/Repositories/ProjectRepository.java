package com.TeamNumberOne.canbusbackend.Repositories;

import com.TeamNumberOne.canbusbackend.Model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, String> {
}