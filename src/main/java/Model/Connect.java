package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Connect {
    private Map<String,String> DB_Table_Paths = new HashMap<String,String>();

    public Connect(){
        DB_Table_Paths.put("DB_Path","canbus-db.csv");
        DB_Table_Paths.put("Node_Table","Node_Table.csv");
        DB_Table_Paths.put("Packet_Table","Packet_Table.csv");
        DB_Table_Paths.put("Project_Table","Project_Table.csv");
    }

}
