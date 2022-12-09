/**
 * @author Mario Everardo Macias
 */
package com.TeamNumberOne.canbusbackend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;


/**
 * Attempted using localhost.run but the configuration on the test system did not operate correctly.
 * Suggested fix was to purchase a subscription as it had a correction in those files.
 * So far this new solution without localhost.run can detect if an ethernet cord is plugged in or not,
 * it can even find the IP for the connected device but there is no support for data transfer from the
 * documentation, either permission issues to get through the firewall are needed for localhost.run or
 * this code could also do the same although neither has been able to pass any files over, we can only
 * ping each end so far.
 * */
@CrossOrigin
@Controller // This means that this class is a com.TeamNumberOne.canbusbackend.Controller
@RequestMapping(path = "/Sync")
public class SynchroManager {
    public static void main(String[] args) {
        Enumeration<NetworkInterface> tempNetInterface = null;
        try {
            tempNetInterface = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        ArrayList<NetworkInterface> interfaces = new ArrayList<>(Collections.list(tempNetInterface));
        ArrayList<NetworkInterface> realInterfaces = new ArrayList<>();
        for(NetworkInterface iNet: interfaces){
            try{
                if (iNet.getHardwareAddress() != null){
                    realInterfaces.add(iNet);
                }
            } catch (SocketException e) {
                System.out.println(e.getMessage());;
            }
        }
        for(NetworkInterface iNet: realInterfaces){
            if(iNet.getName().contains("eth")){
                System.out.println("Ethernet Connection: " + iNet.getDisplayName());
                try{
                    if(iNet.isUp()){
                        System.out.println("Connection is active!" + iNet.getInterfaceAddresses());
                        System.out.println();
                    }else{
                        System.out.println("Connection is inactive!");
                    }
                }catch (SocketException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
