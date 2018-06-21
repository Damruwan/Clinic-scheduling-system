


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JH Jayawardhana
 */
public class Db {
    public static Statement getStatement(){
    try{
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/jh","root","");
            Statement stat = com.createStatement();
            return stat;
        } catch(Exception c){
            c.printStackTrace();
            
        }
    return null;
    }
    
}
