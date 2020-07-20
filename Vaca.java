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
public class Vaca extends GrandePorte implements AnimalProdutor {

     private String ProdutoDerivado;
     private int contaProdutos;
    
    
    public Vaca(String ProdutoDerivado, String tipoAlimentacao, int id, String nome, int idade) {
        super(tipoAlimentacao, id, nome, idade);
        setProdutoDerivado(ProdutoDerivado);
    }

    public String toString(){
        return "Nome: " + getNome() + "  Id: " +  getId();


    }

    public Vaca copiaVaca(){
        Vaca copia = new Vaca(this.getProdutoDerivado(), this.getTipoAlimentacao(), this.getId(), this.getNome(), this.getIdade());
        return copia;
    }
    
    
    public String getProdutoDerivado() {
        return ProdutoDerivado;
    }

    public void setProdutoDerivado(String ProdutoDerivado) {
        this.ProdutoDerivado = ProdutoDerivado;
    }
    
    @Override
    public void calculaPrecoAnimal(){
        double valorFinal=0.0;
        
        if(this.getTipoAlimentacao()=="Pasto"){
            valorFinal=2000.00;
        }
        
        if(this.getTipoAlimentacao()=="Graos"){
            valorFinal=5000.00;
        }
        
        if(this.getTipoAlimentacao()=="Misto"){
            valorFinal=12000.00;
        }
        
        
        System.out.println(valorFinal);   
    }
    
    public void produzProduto(){
        
        this.setContaProdutos(this.getContaProdutos() + 1);
       
        
        
    }
    
    public void registraVaca(Connection conexao,PreparedStatement pst, ResultSet rs){

            //Connection conexao = null;
            //PreparedStatement pst = null;
            //ResultSet rs = null;

           
           
            String sql = "insert into Vaca(produtoDerivado,tipoAlimentacao,id,nome,idade) values (?,?,?,?,?)";
           
            try {
                
                pst = conexao.prepareStatement(sql);
                
                
                pst.setString(1, this.getProdutoDerivado());
                pst.setString(2, this.getTipoAlimentacao());
                pst.setInt(3, this.getId());
                pst.setString(4, this.getNome());
                pst.setInt(5, this.getIdade());
                pst.executeUpdate();
                
            } catch (Exception e) {
                
        }
    
    }


    
    
    
    public int getContaProdutos() {
        return contaProdutos;
    }

    public void setContaProdutos(int contaProdutos) {
        this.contaProdutos = contaProdutos;
    }

}
