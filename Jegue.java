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
public class Jegue extends GrandePorte implements AnimalEntretenimento{



    private double precoPasseio;
    private int contaVisitas;
    
    public Jegue(double precoPasseio, int contaVisitas, String tipoAlimentacao, int id, String nome, int idade) {
        super(tipoAlimentacao, id, nome, idade);
        setPrecoPasseio(precoPasseio);
        setContaVisitas(contaVisitas);
    }
    
    public Jegue copiaJegue(){
        Jegue copia = new Jegue(this.getPrecoPasseio(), this.getContaVisitas(), this.getTipoAlimentacao(), this.getId(), this.getNome(), this.getIdade());
        return copia;
    }
    
    public double getPrecoPasseio() {
        return precoPasseio;
    }

    public void setPrecoPasseio(double precoPasseio) {
        this.precoPasseio = precoPasseio;
    }

    public int getContaVisitas() {
        return contaVisitas;
    }

    public void setContaVisitas(int contaVisitas) {
        this.contaVisitas = contaVisitas;
    }



        

  
    
    
    
    public void calculaPrecoAnimal(double peso){
        
        double valorFinal=0.0;
        
        valorFinal= peso*200.00;
        
        System.out.println(valorFinal);
        
        
    }
    
    @Override
    public void registraVisita(){
        setContaVisitas(getContaVisitas()+1);
        
    }
    
    @Override
    public void imprimeTotal(){
        
        double valorProduzido=0.0;
        
        valorProduzido=valorProduzido+(getContaVisitas()*400.00);
        
        System.out.println(valorProduzido);
        
    }
    
    @Override
    public void calculaPrecoAnimal(){
        double valorFinal=0.0;
        
        if(this.getTipoAlimentacao()=="Pasto"){
            valorFinal=4000.00;
        }
        
        if(this.getTipoAlimentacao()=="Graos"){
            valorFinal=5000.00;
        }
        
        if(this.getTipoAlimentacao()=="Misto"){
            valorFinal=12000.00;
        }
        
        
        System.out.println(valorFinal);   
    }
    
    
    
    
    
    public void registraJegue(Connection conexao,PreparedStatement pst, ResultSet rs){

        //Connection conexao = null;
        //PreparedStatement pst = null;
        //ResultSet rs = null;



       String sql = "insert into Jegue(precoPasseio,contaVisitas, tipoAlimentacao,id,nome,idade) values (?,?,?,?,?,?)";

        try {

            pst = conexao.prepareStatement(sql);


            pst.setDouble(1,this.getPrecoPasseio());
            pst.setInt(2, this.getContaVisitas());
            pst.setString(3, this.getTipoAlimentacao());
            pst.setInt(4, this.getId());
            pst.setString(5, this.getNome());
            pst.setInt(6,this.getIdade());
            pst.executeUpdate();

        } catch (Exception e) {
                
        }
    
    }
    
    
    
    
    
    
}
