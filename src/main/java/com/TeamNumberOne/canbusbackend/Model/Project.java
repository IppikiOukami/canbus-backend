package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Setter
@Getter
@Entity
public class Project {
    @Id
    private String projectID;
    private int vehicleID;
    private int canConnectorID;
    private String analystInitials;
    private String eventName;
    private String eventDate;
    private boolean active;
}
