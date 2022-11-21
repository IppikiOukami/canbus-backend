package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Packet {
    @Id
    private String packetID;
    private String NodeID;
    private String Frame_START;
    private String CAN_ID;
    private String control_Field;
    private String data_Field;
    private String CRC_Field;
    private String ACK;
    private String Frame_END;
}
