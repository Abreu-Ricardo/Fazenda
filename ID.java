
// CLASSE CRIADA POIS JAVA N TEM PONTEIRO ENTAO TIVE Q PASSAR O ENDERECO DE MEMORIA DA CLASSE
public class ID{
    private int iD;
    private String nome;
    private int valorImpressao;

    ID(){
        setID(0);
        setNome("qualquerNome");
        setValorImpressao(0);
    }

    public int  getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(int valorImpressao) {
        this.valorImpressao = valorImpressao;
    }

}