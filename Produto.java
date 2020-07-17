/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cassi
 */
public class Produto {

    public static int numeroDeProdutos=0;
    private String nome;
    private int id;
    private String qualidade;
    private double preco;
    
    
    public Produto(String nome, int id, String qualidade, double preco) {
        setNome(nome);
        setId(id);
        setQualidade(qualidade);
        setPreco(preco);
        
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

        
    
    
}
