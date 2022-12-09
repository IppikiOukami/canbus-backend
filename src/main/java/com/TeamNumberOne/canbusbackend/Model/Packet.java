/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Creates a Table in the database for the Packet object
 * with the attributes as column names.
 * Automatic setters and getters are assigned to each attribute
 * The @Id tage denotes the attribute used as a primary key in the table
 * */
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
