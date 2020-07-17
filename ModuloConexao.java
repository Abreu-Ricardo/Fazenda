/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author cassi
 */
public class ModuloConexao {
    
    //metodo que liga o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //chamada para o driver
        String driver = "com.mysql.jdbc.Driver";
        //Informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/Fazenda";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
        
    
    
    }
    
    
    
}
