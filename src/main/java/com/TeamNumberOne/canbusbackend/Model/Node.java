/**
 * @author Mario Everardo Macias
 */
package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Creates a Table in the database for the Node object
 * with the attributes as column names.
 * Automatic setters and getters are assigned to each attribute
 * The @Id tage denotes the attribute used as a primary key in the table
 * */
@Getter
@Setter
@Entity
public class Node {
    @Id
    private String NodeName;
    private String ProjectID;
    private String NodeID;
    private String annotation;
    private String ICON_PATH;
    private String xyPosition;
    private String isblacklisted;
}
