
// package Fazenda;

public class Deposito {

    
    private int id;
    private int tamanho;
    private Produto[] itens;
    
    
    
    public Deposito(int id, int tamanho, Produto[] itens) {
        setId(id);
        setTamanho(tamanho);
        setItens(itens);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Produto[] getItens() {
        return itens;
    }

    public void setItens(Produto[] itens) {
        this.itens = itens;
    }
    
 
   
    
    
    
    
    
}
