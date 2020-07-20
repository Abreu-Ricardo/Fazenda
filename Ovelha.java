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
public class Ovelha extends PequenoPorte implements AnimalProdutor{

    private String cor;
    private int contaProdutos;

    
    public Ovelha(String cor, double peso, int id, String nome, int idade) {
        super(peso, id, nome, idade);
        setCor(cor);
    }

    public String toString(){
        return "Nome: " + getNome() + "  Id: " +  getId();


    }

    public Ovelha copiaOvelha(){
        Ovelha copia = new Ovelha(this.getCor(), this.getPeso(), this.getId() , this.getNome(), this.getIdade());
        return copia;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public void calculaPrecoAnimal(){
        double valorFinal=0.0;
        
        if(this.getPeso()==10.0 ){
            valorFinal=2000.00;
        }
        
        if(this.getPeso()==20.0 ){
            valorFinal=5000.00;
        }
        
        if(this.getPeso()==30.0 ){
            valorFinal=10000.00;
            
        }
        
        
        System.out.println(valorFinal);   
    }
    
    public void produzProduto(){
          
        this.setContaProdutos(this.getContaProdutos() + 1);
         
    }
    
    
    
    
    
    
    
    
    
    
    public void registraOvelha(Connection conexao,PreparedStatement pst, ResultSet rs){

        //Connection conexao = null;
        //PreparedStatement pst = null;
        //ResultSet rs = null;



        String sql = "insert into Ovelha(cor,peso,id,nome,idade) values (?,?,?,?,?)";

        try {

            pst = conexao.prepareStatement(sql);


            pst.setString(1, this.getCor());
            pst.setDouble(2, this.getPeso());
            pst.setInt(3, this.getId());
            pst.setString(4, this.getNome());
            pst.setInt(5, this.getIdade());
            pst.executeUpdate();

        } catch (Exception e) {
                
    }
    
}
    
    
    
    

    /**
     * @return int return the contaProdutos
     */
    public int getContaProdutos() {
        return contaProdutos;
    }

    /**
     * @param contaProdutos the contaProdutos to set
     */
    public void setContaProdutos(int contaProdutos) {
        this.contaProdutos = contaProdutos;
    }

}
