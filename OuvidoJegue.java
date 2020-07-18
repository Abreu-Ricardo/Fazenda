import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoJegue implements ActionListener{

    private double precoPasseio;
    private int contaVisitas;       // --> CRIAR UM OBJETO DO TIPO JEGUE E SETTAR NELE OS ATRIBUTOS
    
    private Jegue jegue;
    private JMenuItem produtoJegue;
    private JLabel status;
    private int iD;

    OuvidoJegue(Jegue jegue, JMenuItem produtoJegue, JLabel status, int iD){
        setProdutoJegue(produtoJegue);
        setStatus(status);
        setJegue(jegue);
        setID(iD);
    }
    
    @Override
    public void actionPerformed(ActionEvent infoEvento){

        if ( infoEvento.getSource().equals(this.getProdutoJegue()) ){

            // Atualizando barra de status
            this.getStatus().setText("Cadastrando jegue...");


            // REgistro do jegue
            this.getJegue().setId(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual o ID do Jegue?", "Jegue", 3))));
            this.getJegue().setNome(JOptionPane.showInputDialog(null, "Qual nome do Jegue?", "Jegue", 3));            
            this.getJegue().setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual a idade do Jegue?", "Jegue", 3))));
            
            // Registro do produto do Jegue
            this.getJegue().setPrecoPasseio(Float.parseFloat((JOptionPane.showInputDialog(null, "Qual o preco passeio do Jegue?", "Jegue", 3))));
            this.getJegue().setContaVisitas(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de visitas", "Jegue", 3)));
            this.getJegue().setTipoAlimentacao( JOptionPane.showInputDialog(null, "Qual alimentacao do Jegue?", "Jegue", 3) );

        }
        
        else {
            this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Jegue", "Jegue", 3)));

            JOptionPane.showMessageDialog(null, "Escrevendo no Banco de Dados...");
            this.getJegue().registraJegue(null, null, null);
        }

        this.getStatus().setText("Esperando outro cadastro...");

    }

    public void cadastrarProduto(){
        return;
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

    public JMenuItem getProdutoJegue() {
        return produtoJegue;
    }

    public void setProdutoJegue(JMenuItem produtoJegue) {
        this.produtoJegue = produtoJegue;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public Jegue getJegue() {
        return jegue;
    }

    public void setJegue(Jegue jegue) {
        this.jegue = jegue;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

}