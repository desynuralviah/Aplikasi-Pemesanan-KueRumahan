/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kue_rumah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class koneksi {

    public Connection bukaKoneksi()throws SQLException{
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/bdkue", "root", "");
        return con;
    }
    catch(SQLException se){
        System.out.println("No Connection open");
        return null;
    }
catch(Exception ex){
    System.out.println("Cound not open connection");
    return null;
        }
    }
}