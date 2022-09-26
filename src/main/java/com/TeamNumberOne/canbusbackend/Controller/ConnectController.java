package com.TeamNumberOne.canbusbackend.Controller;

import com.TeamNumberOne.canbusbackend.Model.Project;
import com.TeamNumberOne.canbusbackend.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a com.TeamNumberOne.canbusbackend.Controller
@RequestMapping(path = "/visualizer")
public class ConnectController {
    @Autowired // This means to get the bean called projectRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ProjectRepository projectRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewProject (
            @RequestParam String projectID,
            @RequestParam int vehicleID,
            @RequestParam int canConnectorID,
            @RequestParam String analystInitials,
            @RequestParam String eventName,
            @RequestParam String eventDate
    ) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Project np = new Project();
        np.setVehicleID(vehicleID);
        np.setCanConnectorID(canConnectorID);
        np.setProjectID(projectID);
        np.setAnalystInitials(analystInitials);
        np.setEventName(eventName);
        np.setEventDate(eventDate);
        projectRepository.save(np);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Project> getAllProjects() {
        // This returns a JSON or XML with the users
        return projectRepository.findAll();
    }
}
