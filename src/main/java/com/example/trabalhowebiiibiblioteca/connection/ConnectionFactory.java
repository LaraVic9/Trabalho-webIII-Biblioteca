package com.example.trabalhowebiiibiblioteca.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection conn;

    public static Connection getConnection(){

        try {

            if(conn == null){
                Class.forName("com.mysql.jdbc.Driver"); //nessário para conexões em aplicações web
                conn = DriverManager.getConnection("jdbc:mysql://localhost/GerenciarBiblioteca", "lara", "LaraVictoria_@;");
            }

            return conn;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
