/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * Synchro model that stores attributes:
 *  the source IP of the computer actively seeking another computer
 *  the destination IP of the computer being connected to
 *  the status of the connection (active or not)
 *  the frames being transmitted from one computer to another
 */
@Setter
@Getter
public class Synchro {
    private String SOURCE;
    private String DEST;
    private boolean isActive;
    private String[] frames;
}
