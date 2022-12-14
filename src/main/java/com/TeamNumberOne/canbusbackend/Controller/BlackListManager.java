/**
 * @author Mario Everardo Macias
 * @author Daniel Moreno
 */
package com.TeamNumberOne.canbusbackend.Controller;

import com.TeamNumberOne.canbusbackend.Model.BlackList;
import com.TeamNumberOne.canbusbackend.Model.Node;
import com.TeamNumberOne.canbusbackend.Repositories.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
 * Creates a controller for the BlackList model, this allows the population of data in the model,
 * and allows the model to be modified without full access to the model for the end user.
 * */
@CrossOrigin
@Controller // This means that this class is a com.TeamNumberOne.canbusbackend.Controller
@RequestMapping(path = "/Blacklist")
public class BlackListManager {
    @Autowired
    // This means to get the bean called projectRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private NodeRepository nodeRepository;
    private BlackList bl;

    public void runBlacklist(){
        for(String nodeName : bl.getNodeList()){
            Optional<Node> result = nodeRepository.findById(nodeName);
            result.ifPresent(node -> node.setIsblacklisted("True"));
        }
    }

    @GetMapping(path = "/addBlacklist")
    public @ResponseBody String addBlacklist(
            @RequestParam String node_list
    ){
        if(node_list.contains("[")){
            node_list = node_list.replace("[","").replace("]","");
        }
        bl.setNodeList(node_list.split(","));
        bl.setNumNodes(bl.getNodeList().length);
        runBlacklist();
        return bl.getNumNodes()+" node(s) have been blacklisted!";
    }

    @GetMapping(path = "/unlistNodes")
    public @ResponseBody String unlistNodes(
            @RequestParam String node_list
    ){
        if(node_list.contains("[")){
            node_list = node_list.replace("[","").replace("]","");
        }
        String[] nodeNames = node_list.split(",");
        for(String name : nodeNames){
            Optional<Node> result = nodeRepository.findById(name);
            result.ifPresent(node -> node.setIsblacklisted("False"));
        }
        return nodeNames.length + " node(s) have been whitelisted";
    }
}
