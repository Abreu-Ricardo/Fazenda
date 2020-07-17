import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoVaca implements ActionListener{
    
    private String produtoDerivado; // // --> CRIAR UM OBJETO DO TIPO VACA E SETTAR NELE OS ATRIBUTOS
    private Vaca vaca;
    private JMenuItem vacaProduto; // Item dentro do menu Vaca
    private JLabel status;
    private int iD;

    OuvidoVaca(Vaca vaca, JMenuItem vacaProduto ,JLabel status, int iD){
        setVaca(vaca);
        setVacaProduto(vacaProduto);
        setStatus(status);
        setID(iD);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){

        if ( infoEvento.getSource().equals(this.getVacaProduto()) ){

            // Atualizando barra de status
            this.getStatus().setText("Cadastrando vaca...");

            this.getVaca().setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da vaca? ", "Vaca", 3)));
            this.getVaca().setNome(JOptionPane.showInputDialog(null, "Qual o nome da vaca? ", "Vaca", 3));
            this.getVaca().setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade da vaca? ", "Vaca", 3)));
            this.getVaca().setTipoAlimentacao(JOptionPane.showInputDialog(null, "Alimentacao da Vaca: ", "Vaca", 3));
            this.getVaca().setProdutoDerivado(JOptionPane.showInputDialog(null, "Produto derivado da Vaca: ", "Vaca", 3));

            //System.out.println(getProdutoDerivado());
        }

       
        else {
            this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Vaca", "Vaca", 3)));
            
            JOptionPane.showMessageDialog(null, "Escrevendo no banco de Dados...");
            this.getStatus().setText("Escrevendo no banco de Dados...");
            this.getVaca().registraVaca(null, null, null);
        }

        // Atualizando barra de status
        this.getStatus().setText("Esperando outro cadastro...");
        
    }

    public void cadastraProduto(){
        // Dar um jeito de cadastrar no banco de dados
        return;
    }

    public String getProdutoDerivado() {
        return produtoDerivado;
    }

    public void setProdutoDerivado(String produtoDerivado) {
        this.produtoDerivado = produtoDerivado;
    }

    public Vaca getVaca() {
        return this.vaca;
    }

    public void setVaca(Vaca vaca) {
        this.vaca = vaca;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public JMenuItem getVacaProduto() {
        return vacaProduto;
    }

    public void setVacaProduto(JMenuItem vacaProduto) {
        this.vacaProduto = vacaProduto;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

}