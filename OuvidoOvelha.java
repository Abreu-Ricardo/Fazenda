import javax.swing.*;
import java.awt.event.*; // TEM Q SER DESSE JEITO
public class OuvidoOvelha implements ActionListener{

    private String cor;     
    private Ovelha ovelha;
    private JMenuItem produzOvelha;
    private JLabel status;
    private ID identidade = new ID();

    OuvidoOvelha(Ovelha ovelha , JMenuItem produzOvelha, JLabel status,  ID identidade){
        setProduzOvelha(produzOvelha);
        setStatus(status);
        setOvelha(ovelha);
        setIdentidade(identidade);   
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

            this.identidade.setValorImpressao(0);
            this.identidade.setNome("Ovelha"); // Nescessario para saber quem chamou


            System.out.println(getCor());
        }

        else {
            this.identidade.setID(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ID da Ovelha", "Ovelha", 3)));
            this.identidade.setValorImpressao(1);   //Nescessario para saber o q fazer
            this.identidade.setNome("Ovelha");  //Nescessario para saber quem chamou

            JOptionPane.showMessageDialog(null, "Escrevendo no Banco de Dados...");

            this.getOvelha().registraOvelha(null, null, null);

        }

        this.getStatus().setText("Esperando outro cadastro...");
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

    public ID getIdentidade() {
        return identidade;
    }

    public void setIdentidade(ID identidade) {
        this.identidade = identidade;
    }

}