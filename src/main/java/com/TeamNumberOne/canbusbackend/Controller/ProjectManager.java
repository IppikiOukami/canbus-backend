package com.TeamNumberOne.canbusbackend.Controller;

import com.TeamNumberOne.canbusbackend.Model.Project;
import com.TeamNumberOne.canbusbackend.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@Controller // This means that this class is a com.TeamNumberOne.canbusbackend.Controller
@RequestMapping(path = "/visualizer")
public class ProjectManager {
    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping(path="/archive") // Map ONLY POST Requests
    public @ResponseBody String archive (
            @RequestParam String projectID
    ) {
        if(!projectID.equals("")){
            Optional<Project> curProj = projectRepository.findById(projectID);
            if(curProj.isPresent()){
                curProj.ifPresent(project -> project.setActive(false));
                projectRepository.save(curProj.get());
                return "Project Archived!";
            }
        }
        return "Invalid projectID";
    }

    @PostMapping(path = "/newproject")
    public @ResponseBody String newProject(
            @RequestParam String projectID,
            @RequestParam int vehicleID,
            @RequestParam int canConnectorID,
            @RequestParam String analystInitials,
            @RequestParam String eventName,
            @RequestParam String eventDate,
            @RequestParam boolean active
    ){
        Project project = new Project();
        project.setProjectID(projectID);
        project.setVehicleID(vehicleID);
        project.setCanConnectorID(canConnectorID);
        project.setAnalystInitials(analystInitials);
        project.setEventName(eventName);
        project.setEventDate(eventDate);
        project.setActive(active);
        projectRepository.save(project);
        return "Project was saved";
    }

    @PostMapping(path = "/findProject")
    public @ResponseBody Object findProject(
            @RequestParam String projectID
    ){
        Optional<Project> project = projectRepository.findById(projectID);
        return project.isPresent()?project:"No project by that ID";
    }

    @PostMapping(path = "/AllProjects")
    public @ResponseBody Iterable<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    @PostMapping(path = "/archivedProjects")
    public @ResponseBody Iterable<Project> getArchivedProjects(){
        Iterable<Project> projects = projectRepository.findAll();
        List<Project> archivedProjects = new ArrayList<Project>();
        for(Project project:projects){
            if(!project.isActive())
                archivedProjects.add(project);
        }
        return archivedProjects;
    }

    @PostMapping(path = "/activeProjects")
    public @ResponseBody Iterable<Project> getActiveProjects(){
        Iterable<Project> projects = projectRepository.findAll();
        List<Project> activeProjects = new ArrayList<Project>();
        for(Project project:projects){
            if(project.isActive())
                activeProjects.add(project);
        }
        return activeProjects;
    }
}