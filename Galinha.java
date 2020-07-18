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
public class Galinha extends PequenoPorte implements AnimalProdutor{

    private String tamOvo;
    
    public Galinha(String tamOvo, double peso, int id, String nome, int idade) {
        super(peso, id, nome, idade);
        setTamOvo(tamOvo);
    }

    public Galinha copiaGalinha(){
        Galinha copia = new Galinha(this.getTamOvo(), this.getPeso(), this.getId(), this.getNome() , this.getIdade());
        return copia;
    }
    
    public String getTamOvo() {
        return tamOvo;
    }

    public void setTamOvo(String tamOvo) {
        this.tamOvo = tamOvo;
    }


    @Override
    public void calculaPrecoAnimal(){
        double valorFinal=0.0;
        
        if(this.getPeso()==1.0 ){
            valorFinal=2000.00;
        }
        
        if(this.getPeso()==2.0 ){
            valorFinal=5000.00;
        }
        
        if(this.getPeso()==3.0 ){
            valorFinal=10000.00;
            
        }
        
        
        System.out.println(valorFinal);   
    }
    
    @Override
    public void produzProduto(Produto produto){
        
        produto.numeroDeProdutos=produto.numeroDeProdutos+1;
       
        
        
    }

         
    public void registraGalinha(Connection conexao,PreparedStatement pst, ResultSet rs){

            //Connection conexao = null;
            //PreparedStatement pst = null;
            //ResultSet rs = null;

           
           
           String sql = "insert into galinha(tovo,peso,id,nome,idade) values (?,?,?,?,?)";
           
            try {
                
                pst = conexao.prepareStatement(sql);
                
                
                pst.setString(1,this.getTamOvo());
                pst.setDouble(2, this.getPeso());
                pst.setInt(3, this.getId());
                pst.setString(4, this.getNome());
                pst.setInt(5, this.getIdade());
                pst.executeUpdate();
                
            } catch (Exception e) {
                
        }
    
    }


    

    
    
}
