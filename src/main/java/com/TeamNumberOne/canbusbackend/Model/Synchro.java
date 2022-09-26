package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Synchro {
    private String SOURCE_IP;
    private String DEST_IP;
    private boolean isActive;
    private String[] frames;
}
