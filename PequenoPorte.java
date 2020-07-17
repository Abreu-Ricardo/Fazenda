/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cassi
 */
public abstract class PequenoPorte extends Animal{

    private double peso;
    
    public PequenoPorte(double peso, int id, String nome, int idade) {
        super(id, nome, idade);
        setPeso(peso);
    }
    
    
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    @Override
    public void calculaPrecoAnimal(){
        
    }
    
    
}
