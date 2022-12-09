/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * Configuration model that stores attributes:
 *  the analyst initials
 *  the connector ID for the connector being used
 *  the vehicle ID for the connected vehicle
 *  the baud rate for the project
 *  the event name for the project
 *  the date of the event
 *  the DBC file name supplied by DEVCOM
 */
@Getter
@Setter
public class Configuration {
    private String analystInitials;
    private String canConnectorID;
    private String vehicleID;
    private String baudRate;
    private String event_name;
    private String event_date;
    private String DBC_FILE_NAME;
}
