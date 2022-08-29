package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private String NodeName;
    private String annotation;
    private String NodeID;
    private String ICON_PATH;
    private int[] xyPosition;
}
