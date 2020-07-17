import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoOvelha implements ActionListener{

    private String cor;     // --> CRIAR UM OBJETO DO TIPO OVELHA E SETTAR NELE OS ATRIBUTOS
    private Ovelha ovelha;
    private JMenuItem produzOvelha;
    private JLabel status;
    private int iD;

    OuvidoOvelha(Ovelha ovelha , JMenuItem produzOvelha, JLabel status, int iD){
        setProduzOvelha(produzOvelha);
        setStatus(status);
        setOvelha(ovelha);
        setID(iD);
    }

    @Override
    public void actionPerformed(ActionEvent infoEvento){
        if ( infoEvento.getSource().equals(this.getProduzOvelha()) ) {

            this.getStatus().setText("Cadastrando uma ovelha...");
            
            // Registrando ovelha
            this.getOvelha().setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da ovelha?", "Ovelha", 3)));
            this.getOvelha().setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a idade da ovelha?", "Ovelha", 3)));
            this.getOvelha().setNome(JOptionPane.showInputDialog(null, "Qual o nome da ovelha?", "Ovelha", 3));

            // Registrando produto da ovelha
            this.getOvelha().setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o peso da ovelha?", "Ovelha" , 3)));
            this.getOvelha().setCor(JOptionPane.showInputDialog(null, "Cor da ovelha","Ovelha", 3));
            System.out.println(getCor());
        }

        else {
            this.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Ovelha", "Ovelha", 3)));

            JOptionPane.showMessageDialog(null, "Escrevendo no Banco de Dados...");
            this.getOvelha().registraOvelha(null, null, null);

        }

        this.getStatus().setText("Esperando outro cadastro...");
    }

    public void cadastrarProduto() {
        return;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public JMenuItem getProduzOvelha() {
        return produzOvelha;
    }

    public void setProduzOvelha(JMenuItem produzOvelha) {
        this.produzOvelha = produzOvelha;
    }

    public JLabel getStatus() {
        return status;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public Ovelha getOvelha() {
        return ovelha;
    }

    public void setOvelha(Ovelha ovelha) {
        this.ovelha = ovelha;
    }

    public int getID(){
        return this.iD;
    }

    public void setID(int iD){
        this.iD = iD;
    }

}