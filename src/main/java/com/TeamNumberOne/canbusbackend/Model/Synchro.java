package com.TeamNumberOne.canbusbackend.Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Synchro {
    private String SOURCE;
    private String DEST;
    private boolean isActive;
    private String[] frames;
}
