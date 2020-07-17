/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cassi
 */
public abstract class GrandePorte extends Animal {

    
    private String tipoAlimentacao;  
    
    public GrandePorte(String tipoAlimentacao, int id, String nome, int idade) {
        super(id, nome, idade);
        setTipoAlimentacao(tipoAlimentacao);
    }
    
    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public void calculaPrecoAnimal(){
        
    }
    
    
    
    
    
}
