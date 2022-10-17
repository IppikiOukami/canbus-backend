package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Node {
    @Id
    private int nodeID;
    private String projectID;
    private String NodeName;
    private String annotation;
    private String ICON_PATH;
    private String xyPosition;
}
