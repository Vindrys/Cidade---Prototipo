package com.ifpb.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Brasil";
        String usuario = "postgres";
        String senha = "coelho";

        System.out.println(url);
        return DriverManager.getConnection(url, usuario, senha);

    }
}
