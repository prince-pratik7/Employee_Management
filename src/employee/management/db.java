/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.management;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;


/**
 *
 * @author prince_pratik7
 */
public class db {
    
    Connection conn=null;
    public static Connection java_db(){
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\prince_pratik7\\Documents\\NetBeansProjects\\Employee Management\\mydatabase.sqlite");
            return conn;
        }catch (Exception e){ 
            
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }
}
