package Controller;

import Model.Connect;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class ConnectController {

    public static void main(String[] args){
        Connect dbPaths = new Connect();

        for(Map.Entry<String,String> entry: dbPaths.getDB_Table_Paths().entrySet()){
            try{
                String path = Paths.get(".\\src\\main\\resources\\").toAbsolutePath() +"\\" + entry.getValue();
                File dbPath = new File(path);
                if(dbPath.createNewFile()){
                    System.out.print("\nFile does not exist...\nCreating new CSV File...");
                    System.out.println("\nNew CSV File created!" + entry.getKey());
                }
            }catch (IOException e){
                System.out.println("File creation error, check path:" + "\\src\\main\\resources\\" + entry.getValue());
                System.out.println(Paths.get(".\\src\\main\\resources\\").toAbsolutePath());
                e.printStackTrace();
            }
        }
    }
}
