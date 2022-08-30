package Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Packet {
    private String Frame_START;
    private String Frame_END;
    private String control_Field;
    private String data_Field;
    private String CRC_Field;
    private boolean ACK;
}
