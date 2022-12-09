/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

/**
 * Blaclist model that stores attributes:
 *  a node list of the nodes to black list
 *  an integer of the number of nodes to be black listed
 */
@Setter
@Getter
public class BlackList {
    private String[] nodeList;
    private int numNodes;
}
