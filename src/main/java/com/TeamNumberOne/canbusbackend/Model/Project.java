package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Project {
    private String projectID;
    private int vehicleID;
    private int canConnectorID;
    private String analystInitials;
    private String eventName;
    private String eventDate;
}
