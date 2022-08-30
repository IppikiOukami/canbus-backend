package Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Project {
    private String projectID;
    private String analystInitials;
    private int canConnectorID;
    private int vehicleID;
    private int baudRate;
    private String event_name;
    private String event_date;
    private String DBC_FILE_NAME = null;
    private String BLACK_LIST_FILE_NAME = null;
}
