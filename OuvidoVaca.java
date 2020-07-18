import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoVaca implements ActionListener{
    
    private String produzDerivado; // // --> CRIAR UM OBJETO DO TIPO VACA E SETTAR NELE OS ATRIBUTOS
    private Vaca vaca;
    private JMenuItem produzVaca; // Item dentro do menu Vaca
    private JLabel status;
    private int iD;

    OuvidoVaca(Vaca vaca, JMenuItem produzVaca ,JLabel status, int iD){
        setVaca(vaca);
        setProduzVaca(produzVaca);
        setStatus(status);
        setID(iD);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){

        if ( infoEvento.getSource().equals(this.getProduzVaca()) ){

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

    public String getProduzDerivado() {
        return produzDerivado;
    }

    public void setProduzDerivado(String produzDerivado) {
        this.produzDerivado = produzDerivado;
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

    public JMenuItem getProduzVaca() {
        return produzVaca;
    }

    public void setProduzVaca(JMenuItem produzVaca) {
        this.produzVaca = produzVaca;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

}