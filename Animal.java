/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cassi
 */
public abstract class Animal {

    
    private int id;
    private String nome;
    private int idade;
    
    
    public Animal(int id, String nome, int idade) {
        setId(id);
        setNome(nome);
        setIdade(idade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calculaPrecoAnimal(){
        
    }
    
    
    
}
