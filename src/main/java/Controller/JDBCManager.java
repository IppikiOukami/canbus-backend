package controller;
import model.Configuration;

import java.sql.*;

public class JDBCManager {
    public boolean CreateDB(Configuration config){
        try(Connection conn = DriverManager.getConnection(config.getDBC_FILE_NAME())){
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE TEST";
            stmt.executeUpdate(sql);
            System.out.println("Created Successfully!");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean CreateDBTEST(){
        try {
            Driver myDriver = new oracle.jdbc.driver.OracleDriver();
            DriverManager.registerDriver( myDriver );
        }
        catch(SQLException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/")){
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE TEST";
            stmt.executeUpdate(sql);
            System.out.println("Created Successfully!");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args){
        JDBCManager test = new JDBCManager();
        test.CreateDBTEST();
    }
}
