package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BlackList {
    private String[] nodeList;
    private int numNodes;
}