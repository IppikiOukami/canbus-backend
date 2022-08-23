package Controller;

import java.util.UUID;

public class packageController {

    public static void main(String[] args) {
        String ID = UUID.randomUUID().toString();
        String Source_ID = UUID.fromString(ID).toString();
        String Destination_ID = UUID.fromString(ID).toString();
        String message = "This is a test message";
    }
}


