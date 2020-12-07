/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BazaPodataka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jasmin
 */
public class DB {
    
    private static final String url = "jdbc:mysql://localhost:3306/klinikaDB?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "jasmin123";
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection." + ex);
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }
    
    public void unosAmbulante(String naziv, String adresa)
    {
        Statement st = null;
        String upit = "INSERT INTO ambulanta(naziv, adresa) VALUES('"+naziv+"', '"+adresa+"')";
        try{
            st = DB.getConnection().createStatement();
            st.executeUpdate(upit);
        }
        catch(SQLException e)
        {
            System.err.println(e);
        }
    }
}
