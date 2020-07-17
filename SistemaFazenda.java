/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * @author cassi
 */

import java.sql.*;


public class SistemaFazenda {
    /*    
    public static void registraVaca(Connection conexao,PreparedStatement pst, ResultSet rs){

           // Connection conexao = null;
           // PreparedStatement pst = null;
           // ResultSet rs = null;

           Vaca vaca1 = new Vaca(2,"Clotilde");
           
           String sql = "insert into vaca(id,usuario) values (?,?)";
           
            try {
                
                pst = conexao.prepareStatement(sql);
                
                
                pst.setInt(1,vaca1.getId());
                pst.setString(2, vaca1.getNome());
                pst.executeUpdate();
                
            } catch (Exception e) {
                
        }
    
    }

*/
        
    public static void main(String[] args) {
       Connection conexao = null;
       PreparedStatement pst = null;
       ResultSet rs = null;
       
       
       conexao=ModuloConexao.conector();
       System.out.println(conexao);

       Galinha galinha1 = new Galinha("M",20.0,1,"Gisele",5);
       Cavalo cavalo1 = new Cavalo(200.0,5,"Pasto",1,"Pé de pano",15);
       Jegue jegue1 = new Jegue(200.0,1,"Pasto",1,"Mermao",15);
       Vaca vaca1 = new Vaca("Leite", "Pasto",1,"Mimosa",15);
       Ovelha ovelha1 = new Ovelha("Branco",50.0,1,"Oveia",15);
       
       galinha1.registraGalinha(conexao, pst, rs);
       cavalo1.registraCavalo(conexao, pst, rs);
       jegue1.registraJegue(conexao, pst, rs);
       vaca1.registraVaca(conexao, pst, rs);
       ovelha1.registraOvelha(conexao, pst, rs);
       
       //registraVaca(conexao,pst,rs);
       
       
   

   
       
       
       
    }
    
}
