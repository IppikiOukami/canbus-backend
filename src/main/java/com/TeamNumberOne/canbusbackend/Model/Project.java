/**
 * @author Mario Everardo Macias
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Creates a Table in the database for the Project object
 * with the attributes as column names.
 * Automatic setters and getters are assigned to each attribute
 * The @Id tage denotes the attribute used as a primary key in the table
 * */
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
